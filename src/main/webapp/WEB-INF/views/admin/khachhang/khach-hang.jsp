<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="icon" href="/public/images/logo-ico.svg"/>
    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css"/>
    <!-- Bootstrap CSS -->
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet">
    <title>Category</title>
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
                <a href="/admin/tai-khoan/hien-thi" class="list-group-item list-group-item-action border-0"
                   style="background-color: #0a3d62; color: #dcdde1"> <span><i
                        class="fa-solid fa-gauge-high fs-6 px-1"></i></span> Tài Khoản
                </a> <a href="/admin/nhan-vien/hien-thi"
                        class="list-group-item list-group-item-action border-0"
                        style="background-color: #0a3d62; color: #dcdde1"> <span><i
                    class="fa-solid fa-user fs-6 px-1"></i></span> Nhân Viên
            </a> <a href="/admin/san-pham/hien-thi"
                    class="list-group-item list-group-item-action border-0 "
                    style="background-color: #0a3d62; color: #dcdde1"> <span><i
                    class="fa-solid fa-cart-shopping fs-6 px-1"></i></span> Sản Phẩm
            </a> <a href="/admin/khach-hang/hien-thi"
                    class="list-group-item list-group-item-action border-0 "
                    style="background-color: #0a3d62; color: #dcdde1"> <span><i
                    class="fa-solid fa-share-nodes fs-6 px-1"></i></span> Khách Hàng
            </a> <a href="/admin/giay-phep/hien-thi"
                    class="list-group-item list-group-item-action border-0  "
                    style="background-color: #0a3d62; color: #dcdde1"> <span>
							<i class="fa-solid fa-money-check-dollar fs-6 px-1"></i>
					</span> Giấy Phép
            </a> <a href="/admin/voucher/hien-thi"
                    class="list-group-item list-group-item-action border-0  "
                    style="background-color: #0a3d62; color: #dcdde1"> <span>
							<i class="fa-solid fa-arrow-down-9-1 fs-6 px-1"></i>
					</span> Voucher
            </a> <a href="/admin/ban-quyen/hien-thi"
                    class="list-group-item list-group-item-action border-0  "
                    style="background-color: #0a3d62; color: #dcdde1"> <span><i
                    class="fa-solid fa-truck-fast fs-6 px-1"></i></span> Bản Quyền
            </a> <a href="/admin/hoa-don-chi-tiet/hien-thi"
                    class="list-group-item list-group-item-action border-0  "
                    style="background-color: #0a3d62; color: #dcdde1"> <span><i
                    class="fa-solid fa-calendar-check fs-6 px-1"></i></span> Hóa Đơn Chi Tiết
            </a>
                <p class="text-secondary fw-bold">Extras</p>
                <a href="/admin/tac-gia/hien-thi" class="list-group-item list-group-item-action border-0"
                   style="background-color: #0a3d62; color: #dcdde1"> <span><i
                        class="fa-solid fa-gauge-high fs-6 px-1"></i></span> Tác Giả
                </a> <a href="/admin/nha-cung-cap/hien-thi"
                        class="list-group-item list-group-item-action border-0"
                        style="background-color: #0a3d62; color: #dcdde1"> <span><i
                    class="fa-solid fa-user fs-6 px-1"></i></span> Nhà Cung Cấp
            </a> <a href="/admin/nha-xuat-ban/hien-thi"
                    class="list-group-item list-group-item-action border-0 "
                    style="background-color: #0a3d62; color: #dcdde1"> <span><i
                    class="fa-solid fa-cart-shopping fs-6 px-1"></i></span> Nhà Xuất Bản
            </a><a href="/admin/the-loai/hien-thi"
                   class="list-group-item list-group-item-action border-0 "
                   style="background-color: #0a3d62; color: #dcdde1"> <span><i
                    class="fa-solid fa-cart-shopping fs-6 px-1"></i></span> Thể Loại
            </a>
            </div>
        </div>
        <div class="col-10 px-0">
            <nav class="navbar navbar-expand-lg shadow-sm"
                 style="background-color: #ffffff">
                <div class="container-fluid">
                    <div class="collapse navbar-collapse" id="navbarText">
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                            <li class="nav-item"><a class="nav-link active"
                                                    aria-current="page" href="#">Home</a></li>
                            <li class="nav-item"><a class="nav-link" href="#">Features</a>
                            </li>
                            <li class="nav-item"><a class="nav-link" href="#">Pricing</a>
                            </li>
                        </ul>
                        <span class="navbar-text" id="dropAccount" role="button"
                              data-bs-toggle="dropdown" aria-expanded="false">
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

            <div class="px-4 p-3">
                <div class="row">
                    <div class="col-3">
                        <button class="btn btn-info text-white" data-bs-toggle="modal"
                                data-bs-target="#modalAdd">Add new
                        </button>
                        <!-- Modal add -->
                        <div class="modal fade" id="modalAdd" data-bs-backdrop="static"
                             data-bs-keyboard="false" tabindex="-1"
                             aria-labelledby="staticBackdropLabel" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5 class="modal-title" id="staticBackdropLabel">Add a
                                            new category</h5>
                                        <button type="button" class="btn-close"
                                                data-bs-dismiss="modal" aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        <form action="/admin/khach-hang/add" method="post">

                                            <div class="row">
                                                <div class="col-12">
                                                    <label>Họ Và Tên</label>
                                                    <input type="text" class="form-control" name="hoVaTen"/>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col-12">
                                                    <label>Email</label>
                                                    <input type="email" class="form-control" name="email"/>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col-12">
                                                    <label>Số Điện Thoại</label>
                                                    <input type="number" class="form-control" name="sdt"/>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col-12">
                                                    <label>Giới Tính</label>
                                                    <input type="radio" value="1" name="gioiTinh" checked="checked"/> Nam
                                                    <input type="radio" value="0" name="gioiTinh"/> Nữ
                                                </div>
                                            </div>


                                            <div class="row">
                                                <div class="col-12">
                                                    <div class="row mt-4">
                                                        <button class="btn btn-success col-1 m-3" type="submit">
                                                            Add
                                                        </button>
                                                    </div>
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="table-responsive mt-5" style="overflow-x: auto">
                        <table class="table table-bordered">
                            <thead>
                            <tr>
                                <th>ID</th>
                                <th>Tên</th>
                                <th>Số Điện Thoại</th>
                                <th>Email</th>
                                <th>Giới Tính</th>
                                <th>Action</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${ list }" var="l">
                                <tr>
                                    <td>KH${l.idKhachHang}</td>
                                    <td>${l.hoTen}</td>
                                    <td>${l.sdt}</td>
                                    <td>${l.email}</td>
                                    <td>${l.gioiTinh==0?"Nữ":"Nam"}</td>
                                    <td>
                                        <button class="btn btn-primary" data-bs-toggle="modal"
                                                data-bs-target="#modalUpdate_${l.idKhachHang}">
                                            <i class="fa-solid fa-pen-to-square"></i>
                                        </button> <!-- Modal update -->
                                        <div class="modal fade" id="modalUpdate_${l.idKhachHang}"
                                             data-bs-backdrop="static" data-bs-keyboard="false"
                                             tabindex="-1" aria-labelledby="staticBackdropLabel"
                                             aria-hidden="true">
                                            <div class="modal-dialog">
                                                <div class="modal-content">
                                                    <div class="modal-header bg-info">
                                                        <h5 class="modal-title text-white"
                                                            id="staticBackdropLabel">Update a category</h5>
                                                        <button type="button" class="btn"
                                                                data-bs-dismiss="modal" aria-label="Close">
                                                            <i class="fa-solid fa-xmark fs-5 text-white"></i>
                                                        </button>
                                                    </div>
                                                    <div class="modal-body">
                                                        <p>Warning : Bạn Có Muốn Sửa Không !</p>
                                                        <a role="button"
                                                           href="/admin/khach-hang/viewUpdate?id=${l.idKhachHang}"
                                                           class="btn btn-danger w-100 "> Update </a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </td>
                                    <td class="text-center">
                                        <button class="btn btn-danger" data-bs-toggle="modal"
                                                data-bs-target="#modalDelte_${l.idKhachHang}">
                                            <i class="fa-solid fa-trash-can"></i>
                                        </button> <!-- Modal delete -->
                                        <div class="modal fade" id="modalDelte_${l.idKhachHang}"
                                             data-bs-backdrop="static" data-bs-keyboard="false"
                                             tabindex="-1" aria-labelledby="staticBackdropLabel"
                                             aria-hidden="true">
                                            <div class="modal-dialog">
                                                <div class="modal-content">
                                                    <div class="modal-header bg-danger">
                                                        <h5 class="modal-title text-white"
                                                            id="staticBackdropLabel">Delete a category !</h5>
                                                        <button type="button" class="btn"
                                                                data-bs-dismiss="modal" aria-label="Close">
                                                            <i class="fa-solid fa-xmark fs-5 text-white"></i>
                                                        </button>
                                                    </div>
                                                    <div class="modal-body" style="background-color: #fff2df">
                                                        <p>Warning : Bạn Có Muốn Xóa  Không !</p>
                                                        <a role="button"
                                                           href="/admin/khach-hang/delete?id=${l.idKhachHang}"
                                                           class="btn btn-danger w-100 "> Delete </a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </td>

                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>


                    <div class="row">
                        <ul class="pagination justify-content-center">
                            <%--                            <c:forEach var="index" begin="0" end="${ data.totalPages - 1 }">--%>
                            <%--                                <li class="page-item mx-1"><a--%>
                            <%--                                        class="page-link ${ index==page?'bg-black text-white':'' }"--%>
                            <%--                                        href="/admin/categories/index?page=${ index }">${ index + 1 }</a>--%>
                            <%--                                </li>--%>
                            <%--                            </c:forEach>--%>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script>
    var option = {
        animation: true,
        delay: 5000
    }
    document.getElementById("liveToastBtn").onclick = function () {
        var myAlert = document.getElementById("liveToast");
        var bsAlert = new bootstrap.Toast(myAlert, option);
        bsAlert.show();
    }
</script>
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>