/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-02-24 03:46:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zh-cn\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\" />\r\n");
      out.write("<meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("<title>后台管理中心</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("/resources/css/pintuer.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("/resources/css/admin.css\">\r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("/resources/js/jquery.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color: #f2f9fd;\">\r\n");
      out.write("\t<div class=\"header bg-main\">\r\n");
      out.write("\t\t<div class=\"logo margin-big-left fadein-top\">\r\n");
      out.write("\t\t\t<h1>\r\n");
      out.write("\t\t\t\t<img src=\"/resources/images/y.jpg\"\r\n");
      out.write("\t\t\t\t\tclass=\"radius-circle rotate-hover\" height=\"50\" alt=\"\" /> 后台管理中心\r\n");
      out.write("\t\t\t</h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"head-l\">\r\n");
      out.write("\t\t\t<a class=\"button button-little bg-blue\" href=\"login.jsp\"><span\r\n");
      out.write("\t\t\t\tclass=\"icon-power-off\"></span> 退出登录</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"leftnav\">\r\n");
      out.write("\t\t<div class=\"leftnav-title\">\r\n");
      out.write("\t\t\t<strong><span class=\"icon-list\"></span>菜单列表</strong>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<h2>\r\n");
      out.write("\t\t\t<span class=\"icon-user\"></span>基本设置\r\n");
      out.write("\t\t</h2>\r\n");
      out.write("\t\t<ul style=\"display: block\">\r\n");
      out.write("\t\t\t<li><a href=\"index.jsp\" target=\"right\"><span\r\n");
      out.write("\t\t\t\t\tclass=\"icon-caret-right\"></span>添加用户</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"index.jsp\" target=\"right\"><span\r\n");
      out.write("\t\t\t\t\tclass=\"icon-caret-right\"></span>用户列表</a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<h2>\r\n");
      out.write("\t\t\t<span class=\"icon-pencil-square-o\"></span>汽车信息管理\r\n");
      out.write("\t\t</h2>\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"./show.do\" target=\"right\"><span\r\n");
      out.write("\t\t\t\t\tclass=\"icon-caret-right\"></span>客户信息</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"./form.do\" target=\"right\"><span\r\n");
      out.write("\t\t\t\t\tclass=\"icon-caret-right\"></span>添加汽车</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\t$(\".leftnav h2\").click(function() {\r\n");
      out.write("\t\t\t\t$(this).next().slideToggle(200);\r\n");
      out.write("\t\t\t\t$(this).toggleClass(\"on\");\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t\t$(\".leftnav ul li a\").click(function() {\r\n");
      out.write("\t\t\t\t$(\"#a_leader_txt\").text($(this).text());\r\n");
      out.write("\t\t\t\t$(\".leftnav ul li a\").removeClass(\"on\");\r\n");
      out.write("\t\t\t\t$(this).addClass(\"on\");\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<ul class=\"bread\">\r\n");
      out.write("\t\t<li><a href=\"index.jsp\" target=\"right\" class=\"icon-home\"> 首页</a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li><a href=\"##\" id=\"a_leader_txt\">网站信息</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<div class=\"admin\">\r\n");
      out.write("\t\t<iframe scrolling=\"auto\" rameborder=\"0\" src=\"./index.jsp\" name=\"right\"\r\n");
      out.write("\t\t\twidth=\"100%\" height=\"100%\"></iframe>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
