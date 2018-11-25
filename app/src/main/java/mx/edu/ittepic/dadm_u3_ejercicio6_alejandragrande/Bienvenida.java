package mx.edu.ittepic.dadm_u3_ejercicio6_alejandragrande;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class Bienvenida extends View {
    Imagen encabezado, logo, samsung, huawei, lg, htc, puntero, isamsung, ihuawei, ilg, ihtc, carrito;
    int i=0;
    MainActivity obj;

    public Bienvenida(Context context) {
        super(context);
        encabezado= new Imagen(R.drawable.encabezado,580, 200,this);
        logo= new Imagen(R.drawable.logo, 50,50, this);
        samsung=new Imagen(R.drawable.samsung, 50, 770, this);
        huawei =new Imagen(R.drawable.huawei, 700, 710, this );
        lg= new Imagen(R.drawable.lg, 1100, 730, this);
        htc=new Imagen(R.drawable.htc, 1500, 600, this);
        carrito=new Imagen(R.drawable.carrito, 1050, 2000, this);
        puntero=null;

       isamsung=new Imagen(R.drawable.infosamsung, 100, 1350, this );
       isamsung.hacerVisible(false);

       ihuawei=new Imagen(R.drawable.infohuawei, 100, 1350, this );
       ihuawei.hacerVisible(false);

        ilg=new Imagen(R.drawable.infolg, 100, 1350, this );
        ilg.hacerVisible(false);

        ihtc=new Imagen(R.drawable.infohtc, 100, 1350, this );
        ihtc.hacerVisible(false);
        carrito.hacerVisible(false);
        obj=(MainActivity)context;
    }
    protected void onDraw(Canvas c)
    {
        super.onDraw(c);
        Paint p = new Paint();
        encabezado.pintar(c,p);
        logo.pintar(c,p);
        p.setColor(Color.parseColor("#FBE69A"));
        c.drawRect(0, 650, 1440, 1150, p);
        samsung.pintar(c,p);
        huawei.pintar(c,p);
        lg.pintar(c,p);
        htc.pintar(c,p);
        isamsung.pintar(c,p);
        ihuawei.pintar(c,p);
        ilg.pintar(c,p);
        ihtc.pintar(c,p);
        carrito.pintar(c,p);
        /*c.drawBitmap(icono1, 100, 300, p);
        c.drawBitmap(icono2, 600, 300, p);*/
    }
    public boolean onTouchEvent (MotionEvent e)
    {
        float xp= e.getX();
        float yp=  e.getY();
        // mensaje="NO SE HA TOCADO OBJETO"
        Intent pantalla = new Intent(obj, Main2Activity.class);
        switch ( e.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                if(samsung.estaEnArea(xp,yp))
                {
                    puntero=samsung;
                    isamsung.hacerVisible(true);
                    ihuawei.hacerVisible(false);
                    ihtc.hacerVisible(false);
                    ilg.hacerVisible(false);
                    i=1;
                    carrito.hacerVisible(true);

                }
                if(huawei.estaEnArea(xp,yp))
                {
                    puntero=huawei;
                    isamsung.hacerVisible(false);
                    ihuawei.hacerVisible(true);
                    ihtc.hacerVisible(false);
                    ilg.hacerVisible(false);
                    i=2;
                    carrito.hacerVisible(true);
                }
                if(lg.estaEnArea(xp,yp))
                {
                    puntero=lg;
                    isamsung.hacerVisible(false);
                    ihuawei.hacerVisible(false);
                    ihtc.hacerVisible(false);
                    ilg.hacerVisible(true);
                    carrito.hacerVisible(true);
                    i=3;
                }
                if(htc.estaEnArea(xp,yp))
                {
                    puntero=htc;
                    isamsung.hacerVisible(false);
                    ihuawei.hacerVisible(false);
                    ihtc.hacerVisible(true);
                    ilg.hacerVisible(false);
                    i=4;
                    carrito.hacerVisible(true);
                }
                if(carrito.estaEnArea(xp,yp))
                {
                    puntero=carrito;
                    if(puntero==carrito && i!=0)
                    {
                        pantalla.putExtra("opcion", i);
                        obj.startActivity(pantalla);
                    }
                }
                break;
            case MotionEvent.ACTION_MOVE:
                if (puntero!=null)
                {

                    if(puntero==samsung)
                    {
                        samsung.desplaza(xp);
                        huawei.desplaza(xp+550);
                        lg.desplaza(xp+1100);
                        htc.desplaza(xp+1650);
                    }
                    if(puntero==huawei)
                    {
                        samsung.desplaza(xp-550);
                        huawei.desplaza(xp);
                        lg.desplaza(xp+550);
                        htc.desplaza(xp+1100);
                    }
                    if(puntero==lg)
                    {
                        samsung.desplaza(xp-1100);
                        huawei.desplaza(xp-550);
                        lg.desplaza(xp);
                        htc.desplaza(xp+550);
                    }

                    if(puntero==htc) {
                        samsung.desplaza(xp - 1650);
                        huawei.desplaza(xp - 1100);
                        lg.desplaza(xp - 550);
                        htc.desplaza(xp);
                    }
                }
                break;
            case MotionEvent.ACTION_UP:
                puntero=null;
                break;
        }
        invalidate();
        return true;
    }

}
