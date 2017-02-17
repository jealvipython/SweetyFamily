package org.apache.jsp.WEB_002dINF.jsps.Login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/jsps/base/taglib.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write(' ');
      out.write('\n');
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_set_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${smStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/utils/sweetAlert/sweetalert.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${smStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/lib/sweetAlert/sweetalert-dev.js\"> </script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${smStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/lib/sweetAlert/sweetalert.min.js\"> </script>\n");
      out.write("<!--\n");
      out.write("\n");
      out.write("//-->\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\tfunction onFormSubmit(form){\n");
      out.write("\t\t$(form).find(\"select\").attr(\"disabled\",false);\n");
      out.write("\t}\n");
      out.write("\tfunction setSort(value){\n");
      out.write("\t\tvar sort = $(\"#frontSort\").val();\n");
      out.write("\t\tvar isDesc = sort.indexOf(\"DESC\");\n");
      out.write("\t\tif(isDesc==-1 && sort==value){\n");
      out.write("\t\t\t$(\"#frontSort\").val(value+\" DESC\");\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\t$(\"#frontSort\").val(value);\n");
      out.write("\t\t}\n");
      out.write("\t\t$(\"#btnSubmit\").click();\n");
      out.write("\t};\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<title>欢迎来到SweetyFamily</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${smStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/sysindex/styles.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"formContainer\">\r\n");
      out.write("\t\t<form id=\"login\" method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sm}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/sys/user\">\r\n");
      out.write("\t\t\t<a href=\"#\" id=\"flipToRecover\" class=\"flipLink\">Forgot?</a> <input\r\n");
      out.write("\t\t\t\ttype=\"text\" name=\"username\" id=\"loginEmail\" placeholder=\"手机/邮箱/账号\"/>\r\n");
      out.write("\t\t\t<input type=\"password\" name=\"password\" id=\"loginPass\"\r\n");
      out.write("\t\t\t\tplaceholder=\"密码\"/> <input type='button' value=\"Login\"\r\n");
      out.write("\t\t\t\t id=\"login\" onclick=\"sb('Login')\" /> <input type='button' id=\"register\"\r\n");
      out.write("\t\t\t\tvalue=\"register\" onclick=\"sb('register')\" />\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<form id=\"recover\" method=\"post\">\r\n");
      out.write("\t\t\t<a href=\"#\" id=\"flipToLogin\" class=\"flipLink\">Forgot?</a> <input\r\n");
      out.write("\t\t\t\ttype=\"text\" name=\"recoverEmail\" id=\"recoverEmail\"\r\n");
      out.write("\t\t\t\tplaceholder=\"请输入您绑定的邮箱\" /> <input type=\"button\" \r\n");
      out.write("\t\t\t\tvalue=\"Recover\" onclick=\"sb()\" />\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- JavaScript includes -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${smStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/lib/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${smStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/modules/login/script.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${smStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/lib/jquery.form.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    function sb(obj){\r\n");
      out.write("    \tvar username =\t$(\"#loginEmail\").val();\r\n");
      out.write("    \tvar password = $(\"#loginPass\").val();\r\n");
      out.write("    \tif(\"\"==username ||username.length>12){\r\n");
      out.write("    \t\tswal(\"用户名不符合格式\");\r\n");
      out.write("    \t\treturn;\r\n");
      out.write("    \t}\r\n");
      out.write("    \tif(\"\"==password ||password.length>12){\r\n");
      out.write("    \t\tswal(\"密码不符合格式\");\r\n");
      out.write("    \t\treturn;\r\n");
      out.write("    \t}\t\r\n");
      out.write("    \t\r\n");
      out.write("    \t\r\n");
      out.write("    \t\r\n");
      out.write("    \tif(\"Login\"==obj||\"register\"==obj){\r\n");
      out.write("    \t\t$.ajax({\r\n");
      out.write("    \t\t\turl: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sm}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/sys/user\",\r\n");
      out.write("\t\t\t\ttype: \"post\",\r\n");
      out.write("\t\t\t\tdata: {\"username\":username,\"password\":password,\"message\":obj},\r\n");
      out.write("\t\t\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t\t\t\tif(data==\"1\"){\r\n");
      out.write("\t    \t\t\t\t\t//登陆成功\r\n");
      out.write("\t    \t\t\t\t\tswal(\"你好");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getUsername}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("!\", \"欢迎来到fm\", \"success\");\r\n");
      out.write("\t    \t\t\t\t\twindow.location.href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sm}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/sys/index\";\r\n");
      out.write("\t    \t\t\t\t\t}else if(data==\"3\"){\r\n");
      out.write("\t    \t\t\t\t\t\tswal(\"牛逼!\", \"不要胡乱篡改数据\", \"error\");\r\n");
      out.write("\t    \t\t\t\t\t\t\r\n");
      out.write("\t    \t\t\t\t\t}else if(data==\"5\"){\r\n");
      out.write("\t    \t\t\t\t\t\tswal(\"非常抱歉!\", \"用户名密码错误\", \"error\");\r\n");
      out.write("\t    \t\t\t\t\t\t\r\n");
      out.write("\t    \t\t\t\t\t}else if(data==\"2\"){\r\n");
      out.write("\t    \t\t\t\t\t//注册成功\r\n");
      out.write("\t    \t\t\t\t\tswal(\"你好");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getUsername}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("!\", \"注册成功\", \"success\");\r\n");
      out.write("\t    \t\t\t\t\twindow.location.href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sm}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/sys/index\";\r\n");
      out.write("\t    \t\t\t\t\t}else{\r\n");
      out.write("\t    \t\t\t\t\t\tswal(\"失败了~~\");\r\n");
      out.write("\t    \t\t\t\t\t\t\r\n");
      out.write("\t    \t\t\t\t\t}\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("    \t\t})\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t}\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    </script>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("sm");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("smStatic");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}/static", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_set_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent(null);
    _jspx_th_c_set_2.setVar("root");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }
}
