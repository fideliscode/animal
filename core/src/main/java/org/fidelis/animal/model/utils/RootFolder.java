/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fidelis.animal.model.utils;

import javax.servlet.http.HttpServletRequest;
/**
 *
 * @author fidelis
 */
public class RootFolder {
     public static String getRootPath(HttpServletRequest request, String folder) {
        String rootPath = request.getSession().getServletContext().getRealPath(System.getProperty("file.separator"));
        rootPath = rootPath.substring(0, rootPath.lastIndexOf(System.getProperty("file.separator")));
        rootPath = rootPath.substring(0, rootPath.lastIndexOf(System.getProperty("file.separator")));
        return rootPath + folder;
}
}
