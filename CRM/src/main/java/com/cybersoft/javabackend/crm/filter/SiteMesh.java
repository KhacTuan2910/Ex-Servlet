package com.cybersoft.javabackend.crm.filter;

import com.opensymphony.sitemesh.webapp.SiteMeshFilter;

import jakarta.servlet.annotation.WebFilter;

@WebFilter(filterName = "sitemesh", urlPatterns = "/*")
public class SiteMesh extends SiteMeshFilter {

}
