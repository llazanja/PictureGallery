/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.3.9.v20160517
 * Generated at: 2018-05-22 15:56:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/home/lezdnja/.m2/repository/org/glassfish/web/javax.servlet.jsp.jstl/1.2.1/javax.servlet.jsp.jstl-1.2.1.jar!/META-INF/c.tld", Long.valueOf(1323254778000L));
    _jspx_dependants.put("file:/home/lezdnja/.m2/repository/org/glassfish/web/javax.servlet.jsp.jstl/1.2.1/javax.servlet.jsp.jstl-1.2.1.jar", Long.valueOf(1527004463000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t<title>Tags</title>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<style>\r\n");
      out.write("\t\t\t  h1 {font-style: italic; text-align: center;}\r\n");
      out.write("\t\t\t  h1:HOVER {font-style: italic; color: blue;}\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t  .fullImage{width: 100%; height: 100%}\r\n");
      out.write("\t\t\t  .thumbsArea{text-align: center}\r\n");
      out.write("\t\t\t  .tagButton{padding-top: 5px; padding-bottom: 5px; background-color:#768d87; color: white; font-size: 15px; color:#ffffff; font-family:Arial; font-weight: bold; border-radius:5px; border:1px solid #566963; text-shadow:0px -1px 0px #2b665e;}\r\n");
      out.write("\t\t\t  .imageInfo{background-color: #66FF66; font-weight: bold; font-size: 1.2em; text-align: center; font-variant: small-caps;}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\"><!--\t\t\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t\tfunction getTags() {\r\n");
      out.write("\t\t\t\t$.ajax(\r\n");
      out.write("\t\t\t  \t{\r\n");
      out.write("\t\t\t\t\turl: \"servlets/tags\",\r\n");
      out.write("\t\t\t\t \tdataType: \"json\",\r\n");
      out.write("\t\t\t\t \tsuccess: function(data) {\r\n");
      out.write("\t\t\t\t\t\tvar tags = data; // već je JSON zbog dataType gore...\r\n");
      out.write("\t\t\t\t\t\tvar html = \"\";\r\n");
      out.write("\t\t\t\t\t\tvar len = tags.length;\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tif(len == 0) {\r\n");
      out.write("\t\t\t\t\t\t\thtml = \"No results...\";\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\tfor(var i = 0; i < len; i++) {\r\n");
      out.write("\t\t\t\t\t\t\t\thtml += \"<button onclick=getImagesForTag('\" + tags[i] + \"') class=\\\"tagButton\\\">\" + tags[i] + \"</button>\";\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t$(\"#imageInfo\").html(\"\");\r\n");
      out.write("\t\t\t\t\t\t$(\"#tagArea\").html(html);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t \t}\r\n");
      out.write("\t\t\t\t);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\tfunction getImagesForTag(tagValue) {\r\n");
      out.write("\t\t\t\t$.ajax(\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\turl: \"servlets/images\",\r\n");
      out.write("\t\t\t\t\tdata: {\r\n");
      out.write("\t\t\t\t\t\ttag: tagValue\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tdataType: \"json\",\r\n");
      out.write("\t\t\t\t\tsuccess: function(data) {\r\n");
      out.write("\t\t\t\t\t\tvar images = data; // već je JSON zbog dataType gore...\r\n");
      out.write("\t\t\t\t\t\tvar html = \"\";\r\n");
      out.write("\t\t\t\t\t\tvar len = images.length;\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tif(len != 0) {\r\n");
      out.write("\t\t\t\t\t\t\tfor(var i = 0; i < len; i++) {\r\n");
      out.write("\t\t\t\t\t\t\t\thtml += \"<img src=\\\"servlets/image?name=\" + images[i] +\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\"\\\" onclick=\\\"getFullInfo('\" + images[i] + \"');\\\">\";\r\n");
      out.write("\t\t\t\t\t\t\t\tif(i % 2 == 1) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\thtml += \"<br>\";\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tdocument.getElementById(\"fullImage\").innerHTML = \"\";\r\n");
      out.write("\t\t\t\t\t\t$(\"#imageInfo\").html(\"\");\r\n");
      out.write("\t\t\t\t\t\t$(\"#thumbsArea\").html(html);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction getFullImage(name) {\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"fullImage\").innerHTML = \"<img src=\\\"servlets/fullImage?name=\" + name +\r\n");
      out.write("\t\t\t\t\t\t\"\\\" class=\\\"fullImage\\\">\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction getFullInfo(imgName) {\r\n");
      out.write("\t\t\t\t$.ajax(\r\n");
      out.write("\t\t\t  \t{\r\n");
      out.write("\t\t\t\t\turl: \"servlets/imageInfo\",\r\n");
      out.write("\t\t\t\t\tdata: {\r\n");
      out.write("\t\t\t\t\t\tname: imgName\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t \tdataType: \"json\",\r\n");
      out.write("\t\t\t\t \tsuccess: function(data) {\r\n");
      out.write("\t\t\t\t\t\tvar html = \"\";\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tgetFullImage(imgName);\r\n");
      out.write("\t\t\t\t\t\thtml += data[0].info + \"<br>\" + data[0].tags + \"<br>\";\r\n");
      out.write("\t\t\t\t\t\t$(\"#imageInfo\").html(html);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t \t}\r\n");
      out.write("\t\t\t\t);\r\n");
      out.write("\t\t\t}\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t  onload = getTags();\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t//--></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<h1>Game of thrones pictures gallery</h1>\r\n");
      out.write("\t\t<div id=\"tagArea\" class=\"tagArea\">&nbsp;</div><br>\r\n");
      out.write("\t\t<div id=\"thumbsArea\" class=\"thumbsArea\">&nbsp;</div><br>\r\n");
      out.write("\t\t<div id=\"fullImage\">&nbsp;</div>\r\n");
      out.write("\t\t<div id=\"imageInfo\" class=\"imageInfo\">&nbsp;</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
