<!DOCTYPE html>

<html><#assign  path=request.contextPath>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">
    <meta name="applicable-device" content="pc,mobile">
    <title>注册</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" type="text/css" href="${path}/static/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${path}/static/css/index.css">
</head>

<body>
<a class="a globalLoginBtn">注册</a>
<div class="modal fade " id="loginModal" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel"
     aria-hidden="true" style="display: none;">
    <div style="display:table; width:100%; height:100%;">
        <div style="vertical-align:middle; display:table-cell;">
            <div class="modal-dialog modal-sm" style="width:540px;">
                <div class="modal-content" style="border: none;">
                    <div class="col-left"></div>
                    <div class="col-right">
                        <div class="modal-header">
                            <button type="button" id="login_close" class="close" data-dismiss="modal"><span
                                    aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                            <h4 class="modal-title" id="loginModalLabel" style="font-size: 18px;">注册</h4>
                        </div>
                        <div class="modal-body">
                            <section class="box-login v5-input-txt" id="box-login">
                                <form id="login_form" action="/register/doRegister" method="post" autocomplete="off">
                                    <ul>
                                        <li class="form-group">
                                            <input class="form-control" id="id_account_l"
                                                   maxlength="50" name="userName"

                                                   placeholder="请输入邮箱账号/手机号" type="text">
                                        </li>
                                        <li class="form-group">
                                            <input class="form-control" id="id_password_l"
                                                   name="password" placeholder="请输入密码"
                                                   type="password">
                                        </li>
                                    </ul>

                                    <button type="submit" class="btn btn-block  ">
                                        确定
                                    </button>
                                </form>


                            </section>
                        </div>
                    </div>
                </div>
            </div>
            <script type="text/javascript" src="${path}/static/jquery2.2.2.min.js"></script>
            <script type="text/javascript" src="${path}/static/bootstrap.min.js"></script>
            <script type="text/javascript" src="${path}/static/js/common.js"></script>
            <script type="text/javascript" src="${path}/static/js/login.js"></script>
            <div style="text-align:center;">
                <p>更多源码：<a href="http://www.mycodes.net/" target="_blank">源码之家</a></p>
            </div>
        </div>
    </div>
</div>
</body>
</html>











