package com.scau.learnshufa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.tuckey.web.filters.urlrewrite.Conf;
import org.tuckey.web.filters.urlrewrite.UrlRewriteFilter;

import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import java.io.IOException;

//@Configuration
//public class UrlRewriteFilterConfig extends UrlRewriteFilter {
public class UrlRewriteFilterConfig {
    private static final String URL_REWRITE = "classpath:/urlrewrite.xml";

    private Resource resource;

    protected void loadUrlRewriter(FilterConfig filterConfig) throws ServletException {
//        try {
//            Conf conf = null;
//            conf = new Conf(filterConfig.getServletContext(),resource.getInputStream(),resource.getFilename(),"@@traceability@@");
//            checkConf(conf);
//        } catch (IOException e) {
//            e.printStackTrace();
//            throw  new ServletException("Unable to load URL rewrite configuration file from" + URL_REWRITE, e);
//        }

    }
}
