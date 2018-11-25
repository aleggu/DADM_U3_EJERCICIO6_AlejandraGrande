package mx.edu.ittepic.dadm_u3_ejercicio6_alejandragrande;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Imagen {
    private Bitmap icono;
    private float x, y;
    private boolean visible=true;
    public Imagen (int resource, float _x, float _y, Bienvenida b)
    {
        icono=BitmapFactory.decodeResource(b.getResources(), resource);
        x = _x;
        y = _y;

    }
    public Imagen (int resource, float _x, float _y, Articulos a)
    {
        icono=BitmapFactory.decodeResource(a.getResources(), resource);
        x = _x;
        y = _y;

    }

    public void pintar(Canvas c, Paint p)
    {
        if (visible)
        {
            c.drawBitmap(icono, x, y, p);
        }
    }
    public boolean estaEnArea(float xp, float yp)
    {
        float x2, y2;
        x2=x+icono.getWidth();
        y2=y+icono.getHeight();

        if((xp>=x && xp<=x2)&& (yp>=y && yp<=y2))
        {
            return true;
        }
        return false;
    }
    public void desplaza (float xp)
    {
        x=xp-(icono.getWidth()/2);
    }
    public void desplazay (float yp)
    {

            y=yp-(icono.getHeight()/2);

    }
    public void hacerVisible(boolean v)
    {
        visible=v;
    }
}

