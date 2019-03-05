package com.example.ruiz.miprimerservicio;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class ServicioMusica extends Service {

    MediaPlayer reproductor;



    @Override
    public void onCreate() {

        Toast.makeText(this,"Servicio creado",
                Toast.LENGTH_SHORT).show();

        reproductor = MediaPlayer.create(this, R.raw.musica);

    }

    @Override
    public int onStartCommand(Intent intenc, int flags, int idArranque) {

        Toast.makeText(this,"Servicio arrancado "+ idArranque,
                Toast.LENGTH_SHORT).show();

        reproductor.start();

        return START_STICKY;

    }

    @Override
    public void onDestroy() {
        Toast.makeText(this,"Servicio detenido",
                Toast.LENGTH_SHORT).show();

        reproductor.stop();

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
