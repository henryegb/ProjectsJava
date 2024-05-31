package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.MisFavoritos;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();

        miPodcast.setPresentador("Melissa Aguiar");
        miPodcast.setTitulo("Cafe.Tech");

        ///cancion
        for (int i = 0; i < 100 ; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 200 ; i++) {
            miCancion.reproduce();
        }
        System.out.println("Para la cancion:");
        System.out.println("Total de reproducciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de me gusta: " + miCancion.getTotalDeMeGusta());

        //podcast
        for (int i = 0; i < 8000 ; i++) {
            miPodcast.reproduce();
        }

        for (int i = 0; i < 100 ; i++) {
            miPodcast.meGusta();
        }
        System.out.println("Para el Podcast");
        System.out.println("Total de Reproducciones: "+ miPodcast.getTotalDeReproducciones());
        System.out.println("Total de me gusta: "+miPodcast.getTotalDeMeGusta());


        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(miPodcast);
        favoritos.adicione(miCancion);
    }
}
