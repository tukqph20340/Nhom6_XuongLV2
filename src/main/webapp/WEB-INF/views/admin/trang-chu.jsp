<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="icon" href="../public/img/logo-ico.svg"/>
    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css"/>
    <!-- Bootstrap CSS -->
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet">
    <title>Bee Shop Admin</title>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-2 p-4 shadow"
             style="background-color: #0a3d62; height: 100vh">
            <div class="d-flex justify-content-center">
                <a class="navbar-brand" href="#"> <img alt="logo"
                                                       src="https://media.istockphoto.com/id/1304792520/vi/vec-to/s%C3%A1ch-store-thi%E1%BA%BFt-k%E1%BA%BF-logo-vector-kh%C3%A1i-ni%E1%BB%87m-bi%E1%BB%83u-t%C6%B0%E1%BB%A3ng-logo-book-shop.jpg?s=170667a&w=0&k=20&c=9Vl8kxwSdXh4ZsaR6bBMXRkxkCMD0bg36WOW4Nk19UY="
                                                       width="100"
                                                       height="100">
                </a>
            </div>
            <hr>
            <div class="list-group">
                <p class="text-secondary fw-bold">Components</p>
                <a href="/admin/san-pham" class="list-group-item list-group-item-action border-0"
                   style="background-color: #0a3d62; color: #dcdde1"> <span><i
                        class="fa-solid fa-gauge-high fs-6 px-1"></i></span> Sản Phẩm
                </a> <a href="#"
                        class="list-group-item list-group-item-action border-0"
                        style="background-color: #0a3d62; color: #dcdde1"> <span><i
                    class="fa-solid fa-user fs-6 px-1"></i></span> Nhân Viên
            </a> <a href="/admin/danh-sach-san-pham"
                    class="list-group-item list-group-item-action border-0 "
                    style="background-color: #0a3d62; color: #dcdde1"> <span><i
                    class="fa-solid fa-cart-shopping fs-6 px-1"></i></span> Danh Sách  Sản Phẩm
            </a> <a href="/admin/categories/index"
                    class="list-group-item list-group-item-action border-0 "
                    style="background-color: #0a3d62; color: #dcdde1"> <span><i
                    class="fa-solid fa-share-nodes fs-6 px-1"></i></span> Khách Hàng
            </a> <a href="#"
                    class="list-group-item list-group-item-action border-0  "
                    style="background-color: #0a3d62; color: #dcdde1"> <span>
							<i class="fa-solid fa-money-check-dollar fs-6 px-1"></i>
					</span> Giấy Phép
            </a> <a href="#"
                    class="list-group-item list-group-item-action border-0  "
                    style="background-color: #0a3d62; color: #dcdde1"> <span>
							<i class="fa-solid fa-arrow-down-9-1 fs-6 px-1"></i>
					</span> Voucher
            </a> <a href="/admin/orders/index"
                    class="list-group-item list-group-item-action border-0  "
                    style="background-color: #0a3d62; color: #dcdde1"> <span><i
                    class="fa-solid fa-truck-fast fs-6 px-1"></i></span> Bản Quyền
            </a> <a href="/admin/order-details/index"
                    class="list-group-item list-group-item-action border-0  "
                    style="background-color: #0a3d62; color: #dcdde1"> <span><i
                    class="fa-solid fa-calendar-check fs-6 px-1"></i></span> Hóa Đơn Chi Tiết
            </a>
                <p class="text-secondary fw-bold">Extras</p>
                <a href="#"
                   class="list-group-item list-group-item-action border-0 "
                   style="background-color: #0a3d62; color: #dcdde1"> <span><i
                        class="fa-solid fa-message fs-6 px-1"></i></span> Tài Khoản
                </a> <a href="#"
                        class="list-group-item list-group-item-action border-0 "
                        style="background-color: #0a3d62; color: #dcdde1"> <span><i
                    class="fa-solid fa-gear fs-6 px-1"></i></span> Settings
            </a>
            </div>
        </div>
        <div class="col-10 px-0">
            <nav class="navbar navbar-expand-lg shadow-sm"
                 style="background-color: #ffffff">
                <div class="container-fluid">
                    <a class="navbar-brand" href="#"></a>
                    <button class="navbar-toggler" type="button"
                            data-bs-toggle="collapse" data-bs-target="#navbarText"
                            aria-controls="navbarText" aria-expanded="false"
                            aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarText">
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                            <li class="nav-item"><a class="nav-link active"
                                                    aria-current="page" href="/home">Home</a></li>
                            <li class="nav-item"><a class="nav-link" href="#">Features</a>
                            </li>
                            <li class="nav-item"><a class="nav-link" href="#">Pricing</a>
                            </li>
                        </ul>
                        <span class="navbar-text" id="dropAccount" role="button"
                              data-bs-toggle="dropdown" aria-expanded="false">

									<span>

									</span>

							 <i class="fa-solid fa-user fs-4"></i>
							</span>
                        <ul class="dropdown-menu" aria-labelledby="dropAccount"
                            style="left: auto; right: 10px">
                            <li><a class="dropdown-item" href="/home">Home</a></li>
                            <li><a class="dropdown-item" href="/logout">Log out</a></li>
                        </ul>
                    </div>
                </div>
            </nav>
            <div class="row m-0 p-5 g-3">
                <div class="col-3">
                    <div class="card bg-info rounded">
                        <div class="card-header text-white">
                            Total account
                        </div>
                        <div class="card-body">
                            <p class="text-white">${ totalAcc }</p>
                        </div>
                    </div>
                </div>
                <div class="col-3">
                    <div class="card bg-primary rounded">
                        <div class="card-header text-white">
                            Total product
                        </div>
                        <div class="card-body">
                            <p class="text-white">${ totalPro }</p>
                        </div>
                    </div>
                </div>
                <div class="col-3">
                    <div class="card bg-success rounded">
                        <div class="card-header text-white">
                            Total order
                        </div>
                        <div class="card-body">
                            <p class="text-white">${ totalOrder }</p>
                        </div>
                    </div>
                </div>
                <div class="col-3">
                    <div class="card bg-danger rounded">
                        <div class="card-header text-white">
                            Total payment
                        </div>
                        <div class="card-body">
                            <p class="text-white">${ totalPayment }</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>