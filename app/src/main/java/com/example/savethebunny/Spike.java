package com.example.savethebunny;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Random;
import android.graphics.BitmapFactory;

public class Spike {
    Bitmap spike[]=new Bitmap[3];
    int spikeFrame=0;
    int spikeX,spikeY,spikeVelocity;
    Random random;
     public Spike(Context context){
        spike[0]= BitmapFactory.decodeResource(context.getResources(),R.drawable.spike3);
        spike[1]= BitmapFactory.decodeResource(context.getResources(),R.drawable.spike1);
        spike[2]= BitmapFactory.decodeResource(context.getResources(),R.drawable.spike2);
      random =new Random();
      resetPosition();

    }
    public Bitmap getspike(int spikeFrame){
        return spike[spikeFrame];
    }
    public int getSpikeWidth(){
        return spike[0].getWidth();
    }
    public int getSpikeHeight(){
        return spike[0].getHeight();
    }
   public void resetPosition(){
        spikeX=random.nextInt(GameView.dWidth-getSpikeWidth());
        spikeY=-200+random.nextInt(600)*-1;
        spikeVelocity=35+random.nextInt(16);

   }
}
