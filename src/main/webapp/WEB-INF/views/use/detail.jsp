<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="icon" href="/public/images/logo-ico-small.svg"/>
    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css"/>
    <!-- Bootstrap CSS -->
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet">
    <%--    <title>${ product.name }</title>--%>
</head>
<style>

    Scrollbar CSS
    html *::-webkit-scrollbar {
        border-radius: 0;
        width: 8px;
    }

    html *::-webkit-scrollbar {
        border-radius: 0;
        width: 8px;
    }

    html *::-webkit-scrollbar-thumb {
        background-color: rgba(0, 0, 0, .15);
    }

    html *::-webkit-scrollbar-thumb {
        background-color: rgba(0, 0, 0, .15);
    }

    html *::-webkit-scrollbar-track {
        border-radius: 0;
        background-color: rgba(0, 0, 0, 0);
    }

    html *::-webkit-scrollbar-track {
        border-radius: 0;
        background-color: rgba(0, 0, 0, 0);
    }
</style>
<body>
<div class="container-fluid">
    <nav class="navbar navbar-expand-lg row shadow-sm fixed-top px-3"
         style="background-color: #0a3d62">
        <div class="d-flex justify-content-center">
            <a class="navbar-brand" href="#"> <img alt="logo"
                                                   src="https://media.istockphoto.com/id/1304792520/vi/vec-to/s%C3%A1ch-store-thi%E1%BA%BFt-k%E1%BA%BF-logo-vector-kh%C3%A1i-ni%E1%BB%87m-bi%E1%BB%83u-t%C6%B0%E1%BB%A3ng-logo-book-shop.jpg?s=170667a&w=0&k=20&c=9Vl8kxwSdXh4ZsaR6bBMXRkxkCMD0bg36WOW4Nk19UY="
                                                   width="100"
                                                   height="100">
            </a>

            <button class="navbar-toggler " type="button"
                    data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown"
                    aria-controls="navbarNavDropdown" aria-expanded="false"
                    aria-label="Toggle navigation">
                <i class="fa-solid fa-bars fs-2"></i>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavDropdown">
                <ul class="navbar-nav">
                    <li class="nav-item"><a class="nav-link text-white"
                                            aria-current="page" href="/home/hien-thi">Home</a></li>
                    <li class="nav-item"><a class="nav-link text-white" href="#">Sale off</a>
                    </li>
                    <li class="nav-item"><a class="nav-link text-white" href="#">Contact us</a>
                    </li>
                    <li class="nav-item"><a class="nav-link text-white" href="#">Feedbacks</a>
                    </li>
                    <li class="nav-item"><a class="nav-link text-white" href="#">History</a>
                    </li>
                    <li class="nav-item dropdown"><a
                            class="nav-link dropdown-toggle text-white" href="#"
                            id="navbarDropdownMenuLink" role="button"
                            data-bs-toggle="dropdown" aria-expanded="false">Category</a>
                        <ul class="dropdown-menu"
                            aria-labelledby="navbarDropdownMenuLink">
                            <li><a class="dropdown-item" href="#">Action</a></li>
                            <li><a class="dropdown-item" href="#">Another action</a></li>
                            <li><a class="dropdown-item" href="#">Something else
                                here</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
            <div class="d-flex px-4">
                <ul class="navbar-nav">
                    <li class="nav-item"><a class="nav-link text-white"
                                            id="dropAccount" role="button" data-bs-toggle="dropdown"
                                            aria-expanded="false" href="#"> <i
                            class="fa-solid fa-user fs-4"></i>
                    </a>
                        <ul class="dropdown-menu" aria-labelledby="dropAccount"
                            style="top: auto; left: auto;">
                            <%--                            <sec:authorize access="!isAuthenticated()">--%>
                            <%--                                <li><a class="dropdown-item" href="/login">Login</a></li>--%>
                            <%--                            </sec:authorize>--%>
                            <%--                            <sec:authorize access="isAuthenticated()">--%>
                            <%--                                <li><a class="dropdown-item" href="/logout">Logout</a></li>--%>
                            <%--                            </sec:authorize>--%>
                            <%--                            <sec:authorize access="hasAuthority('1') and isAuthenticated()">--%>
                            <%--                                <li><a class="dropdown-item" href="/admin">Manage Users</a></li>--%>
                            <%--                            </sec:authorize>--%>
                        </ul>
                    </li>
                    <li class="nav-item"><a class="nav-link text-white"
                                            aria-current="page" href="#"> <i
                            class="fa-solid fa-magnifying-glass fs-4"></i>
                    </a></li>
                    <li class="nav-item"><a class="nav-link text-white"
                                            aria-current="page" href="/user/carts"> <i
                            class="fa-solid fa-cart-shopping fs-4 position-relative">
                        <c:if test="${ countCart >0}">
								<span
                                        class="position-absolute top-0 start-100 translate-middle badge rounded-pill bg-danger"
                                        style="font-size: 0.5em">
										${ countCart } <span class="visually-hidden">unread messages</span>
								</span>
                        </c:if>
                    </i>
                    </a></li>
                    <li class="nav-item"><a class="nav-link text-white"
                                            aria-current="page" href="#"> <i
                            class="fa-solid fa-wallet fs-4"></i>
                    </a></li>
                    <li class="nav-item"><a class="nav-link text-white"
                                            aria-current="page" href="#"> <i
                            class="fa-solid fa-globe fs-4"></i>
                    </a></li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="bg-light p-3" style="margin-top: 120px">
        <nav aria-label="breadcrumb">
            <ol class="breadcrumb mb-0">
                <li class="breadcrumb-item"><a href="/home">Home</a></li>
                <li class="breadcrumb-item active" aria-current="page">${ detail.tieuDe }</li>
            </ol>
        </nav>
    </div>
    <%-- Main --%>
    <div class="container">
        <form action="/home/gio-hang/add" method="post">
            <input name="idSach" type="hidden" value="${ detail.idSach }"/>
            <input name="tieuDe" type="hidden" value="${ detail.tieuDe }"/>
            <div class="row gy-1 p-5">
                <div class="col-6 p-2">
                    <img alt="${ detail.tieuDe }" src="${ detail.fileAnh }"
                         class="w-100">
                </div>
                <input name="anh" type="hidden" value="${ detail.fileAnh }"/>
                <div class="col-6 px-5">
                    <h1>${ detail.tieuDe }</h1>
                    <h4 class="text-danger fw-bold">${ detail.giaBan }
                        <span>VND</span>
                    </h4>
                    <input name="gia" type="hidden" value="${ detail.giaBan }"/>

                    <p class="mt-4">${ detail.moTa }</p>
                    <h5>
                        Loại sản phẩm : <span class="text-secondary">${ detail.theLoai.ten }</span>
                    </h5>
                    Trạng thái : <span
                        class="text-secondary">${ detail.trangThai=='1'?'Còn hàng':'Hết hàng' }</span>
                    <h5>Số lượng :</h5>

                    <nav aria-label="Page navigation example">
                        <ul class="pagination">
                            <li class="page-item">
                                <button type="button" class="page-link" onClick="onDown()">
                                    <i class="fa-solid fa-minus"></i>
                                </button>
                            </li>
                            <li class="page-item">
                                <p class="text-black">
                                    <input id="quantity" name="soLuong" value="1" class="form-control"/>
                                </p>
                            </li>
                            <li class="page-item">
                                <button type="button" class="page-link" onClick="onUp()">
                                    <i class="fa-solid fa-plus"></i>
                                </button>
                            </li>
                        </ul>
                    </nav>
                    <button class="btn btn-info w-100 text-white" type="submit">
                        <i class="fa-solid fa-cart-shopping"></i> <span>ADD TO
								CART</span>
                    </button>
                </div>
            </div>
        </form>
    </div>
    <%-- Footer --%>
    <div class="row mt-5 p-4" style="background-color: #0a3d62">
        <div class="col-4 text-center">
            <div class="col-4 text-center">
                <img alt="logo"
                     src="https://media.istockphoto.com/id/1304792520/vi/vec-to/s%C3%A1ch-store-thi%E1%BA%BFt-k%E1%BA%BF-logo-vector-kh%C3%A1i-ni%E1%BB%87m-bi%E1%BB%83u-t%C6%B0%E1%BB%A3ng-logo-book-shop.jpg?s=170667a&w=0&k=20&c=9Vl8kxwSdXh4ZsaR6bBMXRkxkCMD0bg36WOW4Nk19UY="
                     height="150px" width="150px">
                <p style="color: #dcdde1">FPT Polytechnic Shopping</p>
            </div>
            <p style="color: #dcdde1">FPT Polytechnic Shopping</p>
        </div>
        <div class="col-4">
            <p class="text-white fw-bold">INFORMATION</p>
            <p style="color: #dcdde1">About Us</p>
            <p style="color: #dcdde1">Delivery Information</p>
            <p style="color: #dcdde1">Privacy Policy</p>
            <p style="color: #dcdde1">Terms and Conditions</p>
            <p style="color: #dcdde1">Returns</p>
            <p style="color: #dcdde1">Gift Certificates</p>
        </div>
        <div class="col-4">
            <p class="text-white fw-bold">CONTACT US</p>
            <form action="">
                <label for="exampleFormControlInput1" class="form-label"
                       style="color: #dcdde1">Email address</label> <input type="email"
                                                                           class="form-control"
                                                                           id="exampleFormControlInput1"
                                                                           placeholder="name@example.com">
                <button type="button" class="btn btn-primary w-100 mt-2">Send</button>
            </form>
        </div>
        <hr>
        <p class="text-center text-white fw-bold">Made by trucnvph17923</p>
    </div>
</div>
<script>
    var quantity = 1;

    function onDown() {
        if (quantity >= 2) {
            quantity -= 1;
        }
        document.getElementById("quantity").value = quantity;
    };

    function onUp() {
        quantity += 1;
        document.getElementById("quantity").value = quantity;
    };
</script>
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>