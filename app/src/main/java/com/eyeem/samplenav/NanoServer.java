package com.eyeem.samplenav;

import fi.iki.elonen.NanoHTTPD;

/**
 * Created by vishna on 22/06/16.
 */
public class NanoServer extends NanoHTTPD {

   private final static int PORT = 8080;
   private NanoRouter router;

   public NanoServer() {
      super(PORT);
      router = new NanoRouter();
   }

   @Override public Response serve(IHTTPSession session) {
      return router.outputFor(session.getUri(), session);
//      String msg = "<html><body><h1>Hello server</h1>\n";
//      msg += "<p>We serve " + session.getUri() + " !</p>";
//      msg +=  "</body></html>\n";
//      return new Response(msg);
   }
}
