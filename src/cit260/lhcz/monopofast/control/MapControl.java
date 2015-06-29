package cit260.lhcz.monopofast.control;

import cit260.lhcz.monopofast.model.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Logan
 */
public class MapControl {

    public static Map createMap() {
        
       Map map = new Map(20,20);
       Scene[] scenes = createScenes();
       assignScenesToLocations(map, scenes);
       return map;
    }

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void moveActorsToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Scene {

        public Scene() {
        }
    }
    
}
