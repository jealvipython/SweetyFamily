package org.apache.jsp.WEB_002dINF.jsps.modules.novel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class novel_005findex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>小说</title>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${smStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/modules/novel/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${smStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/lib/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${smStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/modules/novel/jquery.movebg.js\"></script>\r\n");
      out.write("<script src=\"https://hm.baidu.com/hm.js?b2e5ac9401b5820ffa4e9fa608593a5b\"></script>\r\n");
      out.write("<script type=\"text/javascript\" async=\"\" charset=\"utf-8\" src=\"http://c.cnzz.com/core.php?web_id=30085487&t=q\"></script>\r\n");
      out.write("<script async=\"\" src=\"http://img4.km.com/bookimg/public/javascripts/ga.js\"></script>\r\n");
      out.write("<script src=\"https://img1.km.com/bookimg/public/javascripts/ua_1228.js\"></script>\r\n");
      out.write("<link href=\"https://img2.km.com/bookimg/public/styles/book/global_v2.css?20170106\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://img3.km.com/bookimg/public/styles/book/book_index_v2.css?0122\" rel=\"stylesheet\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://union2.50bang.org/web/ajax59?uId2=SPTNPQRLSX&uId=71595148731109603521246&r=http%3A%2F%2Fbook.km.com%2F&lO=http%3A%2F%2Fbook.km.com%2Fboy.html?nytjsplit=http%3A%2F%2Fbook.km.com%2F\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body id=\"xtopjsinfo\">\r\n");
      out.write("<div class=\"top_bar\">\r\n");
      out.write("<div class=\"wrap_in\">\r\n");
      out.write("<p class=\"main_menu\">\r\n");
      out.write("<a href=\"javascript:addFav();\">欢迎你</a>\r\n");
      out.write("</p>\r\n");
      out.write("<p class=\"user_info\">\r\n");
      out.write("<span class=\"unlogin\">\r\n");
      out.write("<i>|</i>\r\n");
      out.write("<a id=\"top-bar-login\" class=\"login\" href=\"javascript:void(0);\">登录</a>\r\n");
      out.write("<i>|</i>\r\n");
      out.write("<a id=\"top-bar-register\" class=\"register\" href=\"javascript:void(0);\">注册</a>\r\n");
      out.write("</span>\r\n");
      out.write("</p>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("<div class=\"wrap_in\">\r\n");
      out.write("<div class=\"logo\">\r\n");
      out.write("<a href=\"#\">\r\n");
      out.write("<embed wmode=\"transparent\" src=\"http://chabudai.sakura.ne.jp/blogparts/honehoneclock/honehone_clock_wh.swf\" quality=\"high\" bgcolor=\"#ffffff\" width=\"160\" height=\"70\" name=\"honehoneclock\" align=\"middle\" allowscriptaccess=\"always\" type=\"application/x-shockwave-flash\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\">\r\n");
      out.write("</a>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"search_meta\">\r\n");
      out.write("<div class=\"search_box\">\r\n");
      out.write("<form id=\"search_from_top\" action=\"/search.html\" method=\"get\" accept-charset=\"gb2312\" onsubmit=\"return search.check_searchform()\">\r\n");
      out.write("<input id=\"search_type\" name=\"search_type\" value=\"\" type=\"hidden\">\r\n");
      out.write("<input id=\"keyword\" class=\"search_focus\" name=\"keyword\" value=\"请输入书名/作者/标签\" maxlength=\"20\" autocomplete=\"off\" type=\"text\">\r\n");
      out.write("<button class=\"btn_search\" type=\"submit\">搜小说</button>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"search_result\" class=\"suggest_wrap\" style=\"display: none\">\r\n");
      out.write("<div class=\"suggest_box\">\r\n");
      out.write("<ul id=\"search_result_list\"></ul>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
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
}
