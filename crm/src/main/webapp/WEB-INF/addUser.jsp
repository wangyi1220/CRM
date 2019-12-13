<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    

    <title>H+ åå°ä¸»é¢UIæ¡æ¶ - FooTable</title>
    <meta name="keywords" content="H+åå°ä¸»é¢,åå°bootstrapæ¡æ¶,ä¼åä¸­å¿ä¸»é¢,åå°HTML,ååºå¼åå°">
    <meta name="description" content="H+æ¯ä¸ä¸ªå®å¨ååºå¼ï¼åºäºBootstrap3ææ°çæ¬å¼åçæå¹³åä¸»é¢ï¼å¥¹éç¨äºä¸»æµçå·¦å³ä¸¤æ å¼å¸å±ï¼ä½¿ç¨äºHtml5+CSS3ç­ç°ä»£ææ¯">

    <link rel="shortcut icon" href="favicon.ico"> <link href="css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="css/plugins/footable/footable.core.css" rel="stylesheet">

    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/style.min.css?v=4.0.0" rel="stylesheet"><base target="_blank">

</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content animated fadeInRight">

            <div class="row">
                <div class="col-sm-12">
                    <div class="ibox float-e-margins">
                        <div class="ibox-title">
                            <h5>FooTableè¡åæ¢ï¼æåºï¼åé¡µæ¼ç¤º</h5>

                            <div class="ibox-tools">
                                <a class="collapse-link">
                                    <i class="fa fa-chevron-up"></i>
                                </a>
                                <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                                    <i class="fa fa-wrench"></i>
                                </a>
                                <ul class="dropdown-menu dropdown-user">
                                    <li><a href="#">éé¡¹ 01</a>
                                    </li>
                                    <li><a href="#">éé¡¹ 02</a>
                                    </li>
                                </ul>
                                <a class="close-link">
                                    <i class="fa fa-times"></i>
                                </a>
                            </div>
                        </div>
                        <div class="ibox-content">

                            <table class="footable table table-stripped toggle-arrow-tiny" data-page-size="8">
                                <thead>
                                <tr>

                                    <th data-toggle="true">äº§å</th>
                                    <th>åå­</th>
                                    <th>çµè¯</th>
                                    <th data-hide="all">å¬å¸</th>
                                    <th data-hide="all">åæ°</th>
                                    <th data-hide="all">éè´­æ°é</th>
                                    <th data-hide="all">æ¥æ</th>
                                    <th>æä½</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>2015é©å½ç«¥è£é©ççä»ç«¥ç­è£¤</td>
                                    <td>è¢å²³</td>
                                    <td>0800 051213</td>
                                    <td>æ·±å³å¸æå¤§ç¦å®ä¸æéå¬å¸</td>
                                    <td><span class="pie">0.52/1.561</span></td>
                                    <td>200</td>
                                    <td>2015.09.10</td>
                                    <td><a href="#"><i class="fa fa-check text-navy"></i> éè¿</a></td>
                                </tr>
                                <tr>
                                    <td>300ç±³éè¿å£æ¥æ¬åä¸èç£¨</td>
                                    <td>ä»å®æ°¸</td>
                                    <td>0500 780909</td>
                                    <td>å¹¿å·éåè¯ºè´¸ææéå¬å¸</td>
                                    <td><span class="pie">6,9</span></td>
                                    <td>400</td>
                                    <td>2015.10.14</td>
                                    <td><a href="#"><i class="fa fa-check text-navy"></i> éè¿</a></td>
                                </tr>
                                <tr>
                                    <td>åè©ååçå¤è´¸å¥³åæ¹å</td>
                                    <td>å¼ æä¸º</td>
                                    <td>0800 1111</td>
                                    <td>å¹¿å·çº³ä¾æ¯åè´¸åå±æéå¬å¸</td>
                                    <td><span class="pie">3,1</span></td>
                                    <td>750</td>
                                    <td>2015.08.22</td>
                                    <td><a href="#"><i class="fa fa-check text-navy"></i> éè¿</a></td>
                                </tr>
                                <tr>
                                    <td>2015æ°æ¬¾è¾£å¦å­ä¿ªå¨è¿åæ¬¾</td>
                                    <td>æå¨ç¦ </td>
                                    <td>(016977) 0648</td>
                                    <td>è¥å£æ¸¯èç½ç»ç§æè¡ä»½æéå¬å¸</td>
                                    <td><span class="pie">4,9</span></td>
                                    <td>180</td>
                                    <td>2015.11.19</td>
                                    <td><a href="#"><i class="fa fa-check text-navy"></i> éè¿</a></td>
                                </tr>
                                <tr>
                                    <td>300ç±³éè¿å£æ¥æ¬åä¸èç£¨</td>
                                    <td>ä»å®æ°¸</td>
                                    <td>0500 780909</td>
                                    <td>å¹¿å·éåè¯ºè´¸ææéå¬å¸</td>
                                    <td><span class="pie">6,9</span></td>
                                    <td>400</td>
                                    <td>2015.10.14</td>
                                    <td><a href="#"><i class="fa fa-check text-navy"></i> éè¿</a></td>
                                </tr>
                                <tr>
                                    <td>æ­£åå°åº¦çº¢æ²¹
                                    </td>
                                    <td>è¢å²³</td>
                                    <td>0800 051213</td>
                                    <td>æ·±å³å¸æå¤§ç¦å®ä¸æéå¬å¸</td>
                                    <td><span class="pie">0.52/1.561</span></td>
                                    <td>200</td>
                                    <td>2015.09.10</td>
                                    <td><a href="#"><i class="fa fa-check text-navy"></i> éè¿</a></td>
                                </tr>
                                <tr>
                                    <td>2015æ°æ¬¾è¾£å¦å­ä¿ªå¨è¿åæ¬¾</td>
                                    <td>æå¨ç¦ </td>
                                    <td>(016977) 0648</td>
                                    <td>è¥å£æ¸¯èç½ç»ç§æè¡ä»½æéå¬å¸</td>
                                    <td><span class="pie">4,9</span></td>
                                    <td>180</td>
                                    <td>2015.11.19</td>
                                    <td><a href="#"><i class="fa fa-check text-navy"></i> éè¿</a></td>
                                </tr>
                                <tr>
                                    <td>ç¾å½åè£è¿å£çµå­çæ²¹
                                    </td>
                                    <td>è¢å²³</td>
                                    <td>0800 051213</td>
                                    <td>æ·±å³å¸æå¤§ç¦å®ä¸æéå¬å¸</td>
                                    <td><span class="pie">0.52/1.561</span></td>
                                    <td>200</td>
                                    <td>2015.09.10</td>
                                    <td><a href="#"><i class="fa fa-check text-navy"></i> éè¿</a></td>
                                </tr>
                                <tr>
                                    <td>300ç±³éè¿å£æ¥æ¬åä¸èç£¨</td>
                                    <td>ä»å®æ°¸</td>
                                    <td>0500 780909</td>
                                    <td>å¹¿å·éåè¯ºè´¸ææéå¬å¸</td>
                                    <td><span class="pie">6,9</span></td>
                                    <td>400</td>
                                    <td>2015.10.14</td>
                                    <td><a href="#"><i class="fa fa-check text-navy"></i> éè¿</a></td>
                                </tr>
                                <tr>
                                    <td>åè©ååçå¤è´¸å¥³åæ¹å</td>
                                    <td>å¼ æä¸º</td>
                                    <td>0800 1111</td>
                                    <td>å¹¿å·çº³ä¾æ¯åè´¸åå±æéå¬å¸</td>
                                    <td><span class="pie">3,1</span></td>
                                    <td>750</td>
                                    <td>2015.08.22</td>
                                    <td><a href="#"><i class="fa fa-check text-navy"></i> éè¿</a></td>
                                </tr>
                                <tr>
                                    <td>2015æ°æ¬¾è¾£å¦å­ä¿ªå¨è¿åæ¬¾</td>
                                    <td>æå¨ç¦ </td>
                                    <td>(016977) 0648</td>
                                    <td>è¥å£æ¸¯èç½ç»ç§æè¡ä»½æéå¬å¸</td>
                                    <td><span class="pie">4,9</span></td>
                                    <td>180</td>
                                    <td>2015.11.19</td>
                                    <td><a href="#"><i class="fa fa-check text-navy"></i> éè¿</a></td>
                                </tr>
                                <tr>
                                    <td>300ç±³éè¿å£æ¥æ¬åä¸èç£¨</td>
                                    <td>ä»å®æ°¸</td>
                                    <td>0500 780909</td>
                                    <td>å¹¿å·éåè¯ºè´¸ææéå¬å¸</td>
                                    <td><span class="pie">6,9</span></td>
                                    <td>400</td>
                                    <td>2015.10.14</td>
                                    <td><a href="#"><i class="fa fa-check text-navy"></i> éè¿</a></td>
                                </tr>
                                <tr>
                                    <td>æ­£åå°åº¦çº¢æ²¹
                                    </td>
                                    <td>è¢å²³</td>
                                    <td>0800 051213</td>
                                    <td>æ·±å³å¸æå¤§ç¦å®ä¸æéå¬å¸</td>
                                    <td><span class="pie">0.52/1.561</span></td>
                                    <td>200</td>
                                    <td>2015.09.10</td>
                                    <td><a href="#"><i class="fa fa-check text-navy"></i> éè¿</a></td>
                                </tr>
                                <tr>
                                    <td>2015æ°æ¬¾è¾£å¦å­ä¿ªå¨è¿åæ¬¾</td>
                                    <td>æå¨ç¦ </td>
                                    <td>(016977) 0648</td>
                                    <td>è¥å£æ¸¯èç½ç»ç§æè¡ä»½æéå¬å¸</td>
                                    <td><span class="pie">4,9</span></td>
                                    <td>180</td>
                                    <td>2015.11.19</td>
                                    <td><a href="#"><i class="fa fa-check text-navy"></i> éè¿</a></td>
                                </tr>
                                </tbody>
                                <tfoot>
                                <tr>
                                    <td colspan="5">
                                        <ul class="pagination pull-right"></ul>
                                    </td>
                                </tr>
                                </tfoot>
                            </table>

                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-12">
                    <div class="ibox float-e-margins">
                        <div class="ibox-title">
                            <h5>FooTableåé¡µãæåºãè¿æ»¤æ¼ç¤º</h5>

                            <div class="ibox-tools">
                                <a class="collapse-link">
                                    <i class="fa fa-chevron-up"></i>
                                </a>
                                <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                                    <i class="fa fa-wrench"></i>
                                </a>
                                <ul class="dropdown-menu dropdown-user">
                                    <li><a href="#">éé¡¹ 01</a>
                                    </li>
                                    <li><a href="#">éé¡¹ 02</a>
                                    </li>
                                </ul>
                                <a class="close-link">
                                    <i class="fa fa-times"></i>
                                </a>
                            </div>
                        </div>
                        <div class="ibox-content">
                            <input type="text" class="form-control input-sm m-b-xs" id="filter"
                                   placeholder="æç´¢è¡¨æ ¼...">

                            <table class="footable table table-stripped" data-page-size="8" data-filter=#filter>
                                <thead>
                                        <tr>
                                            <th>æ¸²æå¼æ</th>
                                            <th>æµè§å¨</th>
                                            <th>å¹³å°</th>
                                            <th>å¼æçæ¬</th>
                                            <th>CSSç­çº§</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr class="gradeX">
                                            <td>Trident</td>
                                            <td>Internet Explorer 4.0
                                            </td>
                                            <td>Win 95+</td>
                                            <td class="center">4</td>
                                            <td class="center">X</td>
                                        </tr>
                                        <tr class="gradeC">
                                            <td>Trident</td>
                                            <td>Internet Explorer 5.0
                                            </td>
                                            <td>Win 95+</td>
                                            <td class="center">5</td>
                                            <td class="center">C</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Trident</td>
                                            <td>Internet Explorer 5.5
                                            </td>
                                            <td>Win 95+</td>
                                            <td class="center">5.5</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Trident</td>
                                            <td>Internet Explorer 6
                                            </td>
                                            <td>Win 98+</td>
                                            <td class="center">6</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Trident</td>
                                            <td>Internet Explorer 7</td>
                                            <td>Win XP SP2+</td>
                                            <td class="center">7</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Trident</td>
                                            <td>AOL browser (AOL desktop)</td>
                                            <td>Win XP</td>
                                            <td class="center">6</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Gecko</td>
                                            <td>Firefox 1.0</td>
                                            <td>Win 98+ / OSX.2+</td>
                                            <td class="center">1.7</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Gecko</td>
                                            <td>Firefox 1.5</td>
                                            <td>Win 98+ / OSX.2+</td>
                                            <td class="center">1.8</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Gecko</td>
                                            <td>Firefox 2.0</td>
                                            <td>Win 98+ / OSX.2+</td>
                                            <td class="center">1.8</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Gecko</td>
                                            <td>Firefox 3.0</td>
                                            <td>Win 2k+ / OSX.3+</td>
                                            <td class="center">1.9</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Gecko</td>
                                            <td>Camino 1.0</td>
                                            <td>OSX.2+</td>
                                            <td class="center">1.8</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Gecko</td>
                                            <td>Camino 1.5</td>
                                            <td>OSX.3+</td>
                                            <td class="center">1.8</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Gecko</td>
                                            <td>Netscape 7.2</td>
                                            <td>Win 95+ / Mac OS 8.6-9.2</td>
                                            <td class="center">1.7</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Gecko</td>
                                            <td>Netscape Browser 8</td>
                                            <td>Win 98SE+</td>
                                            <td class="center">1.7</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Gecko</td>
                                            <td>Netscape Navigator 9</td>
                                            <td>Win 98+ / OSX.2+</td>
                                            <td class="center">1.8</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Gecko</td>
                                            <td>Mozilla 1.0</td>
                                            <td>Win 95+ / OSX.1+</td>
                                            <td class="center">1</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Gecko</td>
                                            <td>Mozilla 1.1</td>
                                            <td>Win 95+ / OSX.1+</td>
                                            <td class="center">1.1</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Gecko</td>
                                            <td>Mozilla 1.2</td>
                                            <td>Win 95+ / OSX.1+</td>
                                            <td class="center">1.2</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Gecko</td>
                                            <td>Mozilla 1.3</td>
                                            <td>Win 95+ / OSX.1+</td>
                                            <td class="center">1.3</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Gecko</td>
                                            <td>Mozilla 1.4</td>
                                            <td>Win 95+ / OSX.1+</td>
                                            <td class="center">1.4</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Gecko</td>
                                            <td>Mozilla 1.5</td>
                                            <td>Win 95+ / OSX.1+</td>
                                            <td class="center">1.5</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Gecko</td>
                                            <td>Mozilla 1.6</td>
                                            <td>Win 95+ / OSX.1+</td>
                                            <td class="center">1.6</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Gecko</td>
                                            <td>Mozilla 1.7</td>
                                            <td>Win 98+ / OSX.1+</td>
                                            <td class="center">1.7</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Gecko</td>
                                            <td>Mozilla 1.8</td>
                                            <td>Win 98+ / OSX.1+</td>
                                            <td class="center">1.8</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Gecko</td>
                                            <td>Seamonkey 1.1</td>
                                            <td>Win 98+ / OSX.2+</td>
                                            <td class="center">1.8</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Gecko</td>
                                            <td>Epiphany 2.20</td>
                                            <td>Gnome</td>
                                            <td class="center">1.8</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Webkit</td>
                                            <td>Safari 1.2</td>
                                            <td>OSX.3</td>
                                            <td class="center">125.5</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Webkit</td>
                                            <td>Safari 1.3</td>
                                            <td>OSX.3</td>
                                            <td class="center">312.8</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Webkit</td>
                                            <td>Safari 2.0</td>
                                            <td>OSX.4+</td>
                                            <td class="center">419.3</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Webkit</td>
                                            <td>Safari 3.0</td>
                                            <td>OSX.4+</td>
                                            <td class="center">522.1</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Webkit</td>
                                            <td>OmniWeb 5.5</td>
                                            <td>OSX.4+</td>
                                            <td class="center">420</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Webkit</td>
                                            <td>iPod Touch / iPhone</td>
                                            <td>iPod</td>
                                            <td class="center">420.1</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Webkit</td>
                                            <td>S60</td>
                                            <td>S60</td>
                                            <td class="center">413</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Presto</td>
                                            <td>Opera 7.0</td>
                                            <td>Win 95+ / OSX.1+</td>
                                            <td class="center">-</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Presto</td>
                                            <td>Opera 7.5</td>
                                            <td>Win 95+ / OSX.2+</td>
                                            <td class="center">-</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Presto</td>
                                            <td>Opera 8.0</td>
                                            <td>Win 95+ / OSX.2+</td>
                                            <td class="center">-</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Presto</td>
                                            <td>Opera 8.5</td>
                                            <td>Win 95+ / OSX.2+</td>
                                            <td class="center">-</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Presto</td>
                                            <td>Opera 9.0</td>
                                            <td>Win 95+ / OSX.3+</td>
                                            <td class="center">-</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Presto</td>
                                            <td>Opera 9.2</td>
                                            <td>Win 88+ / OSX.3+</td>
                                            <td class="center">-</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Presto</td>
                                            <td>Opera 9.5</td>
                                            <td>Win 88+ / OSX.3+</td>
                                            <td class="center">-</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Presto</td>
                                            <td>Opera for Wii</td>
                                            <td>Wii</td>
                                            <td class="center">-</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Presto</td>
                                            <td>Nokia N800</td>
                                            <td>N800</td>
                                            <td class="center">-</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Presto</td>
                                            <td>Nintendo DS browser</td>
                                            <td>Nintendo DS</td>
                                            <td class="center">8.5</td>
                                            <td class="center">C/A<sup>1</sup>
                                            </td>
                                        </tr>
                                        <tr class="gradeC">
                                            <td>KHTML</td>
                                            <td>Konqureror 3.1</td>
                                            <td>KDE 3.1</td>
                                            <td class="center">3.1</td>
                                            <td class="center">C</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>KHTML</td>
                                            <td>Konqureror 3.3</td>
                                            <td>KDE 3.3</td>
                                            <td class="center">3.3</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>KHTML</td>
                                            <td>Konqureror 3.5</td>
                                            <td>KDE 3.5</td>
                                            <td class="center">3.5</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeX">
                                            <td>Tasman</td>
                                            <td>Internet Explorer 4.5</td>
                                            <td>Mac OS 8-9</td>
                                            <td class="center">-</td>
                                            <td class="center">X</td>
                                        </tr>
                                        <tr class="gradeC">
                                            <td>Tasman</td>
                                            <td>Internet Explorer 5.1</td>
                                            <td>Mac OS 7.6-9</td>
                                            <td class="center">1</td>
                                            <td class="center">C</td>
                                        </tr>
                                        <tr class="gradeC">
                                            <td>Tasman</td>
                                            <td>Internet Explorer 5.2</td>
                                            <td>Mac OS 8-X</td>
                                            <td class="center">1</td>
                                            <td class="center">C</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Misc</td>
                                            <td>NetFront 3.1</td>
                                            <td>Embedded devices</td>
                                            <td class="center">-</td>
                                            <td class="center">C</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Misc</td>
                                            <td>NetFront 3.4</td>
                                            <td>Embedded devices</td>
                                            <td class="center">-</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeX">
                                            <td>Misc</td>
                                            <td>Dillo 0.8</td>
                                            <td>Embedded devices</td>
                                            <td class="center">-</td>
                                            <td class="center">X</td>
                                        </tr>
                                        <tr class="gradeX">
                                            <td>Misc</td>
                                            <td>Links</td>
                                            <td>Text only</td>
                                            <td class="center">-</td>
                                            <td class="center">X</td>
                                        </tr>
                                        <tr class="gradeX">
                                            <td>Misc</td>
                                            <td>Lynx</td>
                                            <td>Text only</td>
                                            <td class="center">-</td>
                                            <td class="center">X</td>
                                        </tr>
                                        <tr class="gradeC">
                                            <td>Misc</td>
                                            <td>IE Mobile</td>
                                            <td>Windows Mobile 6</td>
                                            <td class="center">-</td>
                                            <td class="center">C</td>
                                        </tr>
                                        <tr class="gradeC">
                                            <td>Misc</td>
                                            <td>PSP browser</td>
                                            <td>PSP</td>
                                            <td class="center">-</td>
                                            <td class="center">C</td>
                                        </tr>
                                        <tr class="gradeU">
                                            <td>Other browsers</td>
                                            <td>All others</td>
                                            <td>-</td>
                                            <td class="center">-</td>
                                            <td class="center">U</td>
                                        </tr>
                                    </tbody>
                                    <tfoot>
                                        <tr>
                                            <td colspan="5">
                                                <ul class="pagination pull-right"></ul>
                                            </td>
                                        </tr>
                                    </tfoot>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    <script src="js/jquery.min.js?v=2.1.4"></script>
    <script src="js/bootstrap.min.js?v=3.3.5"></script>
    <script src="js/plugins/footable/footable.all.min.js"></script>
    <script src="js/content.min.js?v=1.0.0"></script>
    <script>
        $(document).ready(function(){$(".footable").footable();$(".footable2").footable()});
    </script>
    <script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
</body>

</html>