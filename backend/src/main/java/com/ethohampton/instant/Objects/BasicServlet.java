package com.ethohampton.instant.Objects;

import com.google.appengine.api.NamespaceManager;

import javax.servlet.http.HttpServlet;

/**
 * Created by ethohampton on 12/16/16.
 * basic servlet for my own use
 */

public class BasicServlet extends HttpServlet {
    public BasicServlet() {
        //OfyService.ofy().factory().begin();
        NamespaceManager.set("Questions");
    }
}
