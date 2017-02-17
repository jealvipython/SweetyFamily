package org.apache.jsp.WEB_002dINF.jsps.modules.sysindex;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sysindex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/WEB-INF/jsps/base/taglib.jsp");
    _jspx_dependants.add("/WEB-INF/jsps/base/backToLogin.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>您好");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<center>\r\n");
      out.write("\t<section id=\"rt-showcase-surround\">\r\n");
      out.write("\t\t<div id=\"rt-showcase\" class=\"slider-container rt-overlay-dark\">\r\n");
      out.write("\t\t\t<div class=\"rt-container slider-container\">\r\n");
      out.write("\t\t\t\t<div class=\"rt-grid-12 rt-alpha rt-omega\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${smStatic }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/sysindex/style.css\">\r\n");
      out.write("\t\t\t\t\t<!--[if IE]><link rel=\"stylesheet\" href=\"css/ie.css\"><![endif]-->\r\n");
      out.write("\t\t\t\t\t<!--[if lte IE 9]><script type=\"text/javascript\" src=\"js/ie.js\"></script><![endif]-->\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t<div class=\"csslider1 autoplay\">\r\n");
      out.write("\t\t\t\t\t\t<input name=\"cs_anchor1\" autocomplete=\"off\" id=\"cs_slide1_0\" type=\"radio\" class=\"cs_anchor slide\" >\r\n");
      out.write("\t\t\t\t\t\t<input name=\"cs_anchor1\" autocomplete=\"off\" id=\"cs_slide1_1\" type=\"radio\" class=\"cs_anchor slide\" >\r\n");
      out.write("\t\t\t\t\t\t<input name=\"cs_anchor1\" autocomplete=\"off\" id=\"cs_slide1_2\" type=\"radio\" class=\"cs_anchor slide\" >\r\n");
      out.write("\t\t\t\t\t\t<input name=\"cs_anchor1\" autocomplete=\"off\" id=\"cs_play1\" type=\"radio\" class=\"cs_anchor\" checked>\r\n");
      out.write("\t\t\t\t\t\t<input name=\"cs_anchor1\" autocomplete=\"off\" id=\"cs_pause1\" type=\"radio\" class=\"cs_anchor\" >\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"width: 100%; visibility: hidden; font-size: 0px; line-height: 0;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${smStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/sysindex/1.jpg\" style=\"width: 100%;\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"num0 img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${smStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/sysindex/1.jpg\" alt=\"小说\" title=\"小说\" onclick=\"novel()\" />\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"num1 img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${smStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/sysindex/2.jpg\" alt=\"动漫频道\" title=\"动漫频道\"  onclick=\"animation()\"/>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"num2 img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${smStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/sysindex/3.jpg\" alt=\"电影电视剧频道\" title=\"电影电视剧频道\" onclick=\"movie()\" />\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"cs_description\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"num0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"cs_title\"><span class=\"cs_wrapper\">电影电视剧频道</span></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"num1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"cs_title\"><span class=\"cs_wrapper\">动漫频道</span></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"num2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"cs_title\"><span class=\"cs_wrapper\">小说频道</span></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"cs_arrowprev\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"num0\" for=\"cs_slide1_0\"></label>\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"num1\" for=\"cs_slide1_1\"></label>\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"num2\" for=\"cs_slide1_2\"></label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"cs_arrownext\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"num0\" for=\"cs_slide1_0\"></label>\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"num1\" for=\"cs_slide1_1\"></label>\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"num2\" for=\"cs_slide1_2\"></label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"cs_bullets\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"num0\" for=\"cs_slide1_0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"cs_point\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"cs_thumb\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${smStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/sysindex/small/1.jpg\" alt=\"Clouds\" title=\"Clouds\" /></span>\r\n");
      out.write("\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"num1\" for=\"cs_slide1_1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"cs_point\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"cs_thumb\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${smStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/sysindex/small/2.jpg\" alt=\"Typewriter\" title=\"Typewriter\" /></span>\r\n");
      out.write("\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"num2\" for=\"cs_slide1_2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"cs_point\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"cs_thumb\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${smStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/sysindex/small/3.jpg\" alt=\"Bicycle\" title=\"Bicycle\" /></span>\r\n");
      out.write("\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>      \r\n");
      out.write("</center>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${smStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/lib/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${smStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/lib/jquery.form.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function novel(){\r\n");
      out.write("\t\r\n");
      out.write("\twindow.location.href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sm}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/sys/novel/index.php\";\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function movie(){\r\n");
      out.write("\twindow.location.href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sm}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/sys/movie/index.php\";\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("function animation(){\r\n");
      out.write("\twindow.location.href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sm}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/sys/animation/index.php\";\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty user ||null==user}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('\r');
        out.write('\n');
        if (true) {
          _jspx_page_context.forward("../Login/index.jsp");
          return true;
        }
        out.write("\r\n");
        out.write("\r\n");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
