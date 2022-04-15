/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fidelis.animal.web.servlet;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.fidelis.animal.ServiceLocator;
import org.fidelis.animal.model.animal.AnimalVO;
import org.fidelis.animal.model.feed.FeedVO;
import org.fidelis.animal.web.response.object.AnimalApiResponse;
import org.fidelis.animal.web.response.object.AnimalData;
import org.fidelis.animal.web.response.object.FeedData;
import org.primefaces.json.JSONException;
import org.primefaces.json.JSONObject;

/**
 *
 * @author user
 */
public class AnimalServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, JSONException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        try {
            Collection<AnimalVO> animals = new ArrayList();
            AnimalApiResponse animalApiResponse =new AnimalApiResponse();
         
            animals.addAll(ServiceLocator.instance().getAnimalService().loadAll());
            List<AnimalData> animalDatas = new ArrayList();
            for (AnimalVO animal : animals) {
                AnimalData animalData = new AnimalData();
                animalData.setBreed(animal.getBreed());
                animalData.setCategory(null);
                animalData.setDob(animal.getDateOfBirth().toString());
                animalData.setId(animal.getId().toString());
                animalData.setType(animal.getType());
                animalData.setUrlImage("http://192.168.1.62:8080/animal-documents/uploads/not-found.png");
                if (animal.getFeedId() != null) {
                    FeedVO feed = ServiceLocator.instance().getFeedService().load(animal.getFeedId());
                    FeedData feedData = new FeedData();
                    feedData.setCode(feed.getCode());
                    feedData.setDescription(feed.getDescription());
                    feedData.setId(feed.getId().toString());
                    feedData.setIntakeRate(feed.getIntakeRate());
                    feedData.setIntakeWeight(feed.getIntakeWeight());
                    feedData.setName(feed.getName());
                    animalData.setFeed(feedData);
                }
                animalDatas.add(animalData);
            }
               animalApiResponse.setAnimals(animalDatas);
               animalApiResponse.setStatus("ok");
               animalApiResponse.setTotalResults(animalDatas.size());
            String resp = new Gson().toJson(animalApiResponse);
             System.out.println(new Date());
            System.out.println(resp);
            out.write(resp);
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (JSONException ex) {
            Logger.getLogger(AnimalServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (JSONException ex) {
            Logger.getLogger(AnimalServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
