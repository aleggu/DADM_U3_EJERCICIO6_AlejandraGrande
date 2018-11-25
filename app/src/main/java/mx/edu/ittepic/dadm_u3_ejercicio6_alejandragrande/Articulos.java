package mx.edu.ittepic.dadm_u3_ejercicio6_alejandragrande;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Switch;

public class Articulos extends View {
 Main2Activity obj2;
 int opcion;
 Imagen marca, titulo, tm1, tm2, tm3, tm4, telefono1, telefono2, telefono3, telefono4, punterom, modelo1, modelo2, modelo3, modelo4, descripcion1, descripcion2, descripcion3, descripcion4;

 public Articulos(Context context) {
        super(context);
        obj2=(Main2Activity)context;
        opcion=obj2.getIntent().getExtras().getInt("opcion");

        if(opcion==1)
        {
            marca=new Imagen(R.drawable.samsung, 10, 200, this);
            modelo1=new Imagen(R.drawable.logos, 35, 750, this);
            modelo2=new Imagen(R.drawable.logoa, 35, 1300, this);
            modelo3=new Imagen(R.drawable.logoj, 35, 1950, this);
            modelo4=new Imagen(R.drawable.logon, 35,2500, this);
            titulo=new Imagen(R.drawable.titulosamsung, 620, 80,this);
            tm1=new Imagen(R.drawable.galaxys, 620,250, this);
            tm2=new Imagen(R.drawable.galaxya, 620,250, this);
            tm3=new Imagen(R.drawable.galaxyj, 620,250, this);
            tm4=new Imagen(R.drawable.galaxyn, 620,250, this);
            telefono1=new Imagen(R.drawable.samsungsmorado, 700, 600,this);
            telefono2=new Imagen(R.drawable.samsungadorado, 700, 600,this);
            telefono3=new Imagen(R.drawable.samsungjazul, 700, 600,this);
            telefono4=new Imagen(R.drawable.noteazul, 700, 600,this);
            descripcion1=new Imagen(R.drawable.descripcions, 620, 1500, this);
            descripcion2=new Imagen(R.drawable.descripciona, 620, 1500, this);
            descripcion3=new Imagen(R.drawable.descripcionj, 620, 1500, this);
            descripcion4=new Imagen(R.drawable.descripcionn, 620, 1500, this);

        }
     if(opcion==2)
     {
         marca=new Imagen(R.drawable.huawei, 150, 200, this);
        modelo1=new Imagen(R.drawable.logomate, 30, 750, this);
         modelo2=new Imagen(R.drawable.logonova, 30, 1300, this);
         modelo3=new Imagen(R.drawable.logop, 30, 1950, this);
         modelo4=new Imagen(R.drawable.logoy, 30,2500, this);
         titulo=new Imagen(R.drawable.titulohuawei, 620, 80,this);
         tm1=new Imagen(R.drawable.huaweimate, 620,250, this);
         tm2=new Imagen(R.drawable.huaweinova, 620,250, this);
         tm3=new Imagen(R.drawable.huaweip, 620,250, this);
         tm4=new Imagen(R.drawable.huaweiy, 620,250, this);
         telefono1=new Imagen(R.drawable.matebeige, 700, 600,this);
         telefono2=new Imagen(R.drawable.novatwitlight, 700, 600,this);
         telefono3=new Imagen(R.drawable.prosa, 700, 600,this);
         telefono4=new Imagen(R.drawable.ynegro, 700, 600,this);
         descripcion1=new Imagen(R.drawable.descripcionmate, 620, 1500, this);
         descripcion2=new Imagen(R.drawable.descripcionnova, 620, 1500, this);
         descripcion3=new Imagen(R.drawable.descripcionp, 620, 1500, this);
         descripcion4=new Imagen(R.drawable.descripciony, 620, 1500, this);

     }

     if(opcion==3)
     {
         marca=new Imagen(R.drawable.lg, 40, 200, this);
         modelo1=new Imagen(R.drawable.logoxsyle, 30, 750, this);
         modelo2=new Imagen(R.drawable.logostylus, 30, 1300, this);
         modelo3=new Imagen(R.drawable.logoprime, 30, 1950, this);
         modelo4=new Imagen(R.drawable.logok, 30,2500, this);
         titulo=new Imagen(R.drawable.titulolg, 620, 80,this);
         tm1=new Imagen(R.drawable.lgstyle, 800,250, this);
         tm2=new Imagen(R.drawable.lgstylus, 800,250, this);
         tm3=new Imagen(R.drawable.lgprime, 800,250, this);
         tm4=new Imagen(R.drawable.lgk, 760,250, this);
         telefono1=new Imagen(R.drawable.stylelanco, 700, 600,this);
         telefono2=new Imagen(R.drawable.stylusdorado, 700, 600,this);
         telefono3=new Imagen(R.drawable.primeazul, 700, 600,this);
         telefono4=new Imagen(R.drawable.knegro, 700, 600,this);
         descripcion1=new Imagen(R.drawable.descripcionstyle, 620, 1500, this);
         descripcion2=new Imagen(R.drawable.descripcionstylus, 620, 1500, this);
         descripcion3=new Imagen(R.drawable.descripcionprime, 620, 1500, this);
         descripcion4=new Imagen(R.drawable.descripcionk, 620, 1500, this);

     }
     if(opcion==4)
     {
         marca=new Imagen(R.drawable.htc, -50, 70, this);
         modelo1=new Imagen(R.drawable.logodesire, 30, 750, this);
         modelo2=new Imagen(R.drawable.logoonem, 30, 1300, this);
         modelo3=new Imagen(R.drawable.lgoonea, 30, 1950, this);
         modelo4=new Imagen(R.drawable.logou, 30,2500, this);
         titulo=new Imagen(R.drawable.titulohtc, 620, 80,this);
         tm1=new Imagen(R.drawable.htcdesire, 700,250, this);
         tm2=new Imagen(R.drawable.htconem, 700,250, this);
         tm3=new Imagen(R.drawable.htconea, 700,250, this);
         tm4=new Imagen(R.drawable.htcu, 700,250, this);
         telefono1=new Imagen(R.drawable.desireblanco, 700, 600,this);
         telefono2=new Imagen(R.drawable.mazul, 700, 600,this);
         telefono3=new Imagen(R.drawable.atinto, 700, 600,this);
         telefono4=new Imagen(R.drawable.ugris, 700, 600,this);
         descripcion1=new Imagen(R.drawable.descripciondesire, 620, 1500, this);
         descripcion2=new Imagen(R.drawable.descripciononem, 620, 1500, this);
         descripcion3=new Imagen(R.drawable.descripciononea, 620, 1500, this);
         descripcion4=new Imagen(R.drawable.descricpionu, 620, 1500, this);

     }
        titulo.hacerVisible(false);
        tm1.hacerVisible(false);
        tm2.hacerVisible(false);
        tm3.hacerVisible(false);
        tm4.hacerVisible(false);
        telefono1.hacerVisible(false);
        telefono2.hacerVisible(false);
        telefono3.hacerVisible(false);
        telefono4.hacerVisible(false);
        descripcion1.hacerVisible(false);
        descripcion2.hacerVisible(false);
        descripcion3.hacerVisible(false);
        descripcion4.hacerVisible(false);
    }

    protected void onDraw(Canvas c) {
        super.onDraw(c);
        Paint p = new Paint();
        if(opcion==1)
        {
            p.setColor(Color.parseColor("#40A7DE"));
            c.drawRect(0, 0, 570, 2960,p);
        }
        if(opcion==2)
        {

            p.setColor(Color.parseColor("#FA7876"));
            c.drawRect(0, 0, 570, 2960,p);
        }
        if(opcion==3)
        {

            p.setColor(Color.parseColor("#EB4191"));
            c.drawRect(0, 0, 570, 2960,p);
        }
        if(opcion==4)
        {

            p.setColor(Color.parseColor("#ABEB41"));
            c.drawRect(0, 0, 570, 2960,p);
        }
            marca.pintar(c, p);
            modelo1.pintar(c, p);
            modelo2.pintar(c, p);
            modelo3.pintar(c, p);
            modelo4.pintar(c, p);
            titulo.pintar(c, p);
            tm1.pintar(c, p);
            tm2.pintar(c, p);
            tm3.pintar(c, p);
            tm4.pintar(c, p);
            telefono1.pintar(c, p);
            telefono2.pintar(c, p);
            telefono3.pintar(c, p);
            telefono4.pintar(c, p);
            descripcion1.pintar(c, p);
            descripcion2.pintar(c, p);
            descripcion3.pintar(c, p);
            descripcion4.pintar(c, p);

    }
    public boolean onTouchEvent (MotionEvent e) {
        float xp = e.getX();
        float yp = e.getY();
        // mensaje="NO SE HA TOCADO OBJETO"
        switch (e.getAction()) {
            case MotionEvent.ACTION_DOWN:
                if(modelo1.estaEnArea(xp,yp))
                {
                    punterom=modelo1;
                    titulo.hacerVisible(true);
                    tm1.hacerVisible(true);
                    tm2.hacerVisible(false);
                    tm3.hacerVisible(false);
                    tm4.hacerVisible(false);
                    telefono1.hacerVisible(true);
                    telefono2.hacerVisible(false);
                    telefono3.hacerVisible(false);
                    telefono4.hacerVisible(false);
                    descripcion1.hacerVisible(true);
                    descripcion2.hacerVisible(false);
                    descripcion3.hacerVisible(false);
                    descripcion4.hacerVisible(false);
                }
                if(modelo2.estaEnArea(xp,yp))
                {
                    punterom=modelo2;
                    titulo.hacerVisible(true);
                    tm1.hacerVisible(false);
                    tm2.hacerVisible(true);
                    tm3.hacerVisible(false);
                    tm4.hacerVisible(false);
                    telefono1.hacerVisible(false);
                    telefono2.hacerVisible(true);
                    telefono3.hacerVisible(false);
                    telefono4.hacerVisible(false);
                    descripcion1.hacerVisible(false);
                    descripcion2.hacerVisible(true);
                    descripcion3.hacerVisible(false);
                    descripcion4.hacerVisible(false);
                }
                if(modelo3.estaEnArea(xp,yp))
                {
                    punterom=modelo3;
                    titulo.hacerVisible(true);
                    tm1.hacerVisible(false);
                    tm2.hacerVisible(false);
                    tm3.hacerVisible(true);
                    tm4.hacerVisible(false);
                    telefono1.hacerVisible(false);
                    telefono2.hacerVisible(false);
                    telefono3.hacerVisible(true);
                    telefono4.hacerVisible(false);
                    descripcion1.hacerVisible(false);
                    descripcion2.hacerVisible(false);
                    descripcion3.hacerVisible(true);
                    descripcion4.hacerVisible(false);
                }
                if(modelo4.estaEnArea(xp,yp))
                {
                    punterom=modelo4;
                    titulo.hacerVisible(true);
                    tm1.hacerVisible(false);
                    tm2.hacerVisible(false);
                    tm3.hacerVisible(false);
                    tm4.hacerVisible(true);
                    telefono1.hacerVisible(false);
                    telefono2.hacerVisible(false);
                    telefono3.hacerVisible(false);
                    telefono4.hacerVisible(true);
                    descripcion1.hacerVisible(false);
                    descripcion2.hacerVisible(false);
                    descripcion3.hacerVisible(false);
                    descripcion4.hacerVisible(true);
                }
                break;
            case MotionEvent.ACTION_MOVE:
                if (punterom!=null)
                {

                    if(punterom==modelo1)
                    {
                        modelo1.desplazay(yp);
                        modelo2.desplazay(yp+650);
                        modelo3.desplazay(yp+1300);
                        modelo4.desplazay(yp+1950);
                    }
                    if(punterom==modelo2)
                    {
                        modelo1.desplazay(yp-650);
                        modelo2.desplazay(yp);
                        modelo3.desplazay(yp+650);
                        modelo4.desplazay(yp+1300);
                    }
                    if(punterom==modelo3)
                    {
                        modelo1.desplazay(yp-1300);
                        modelo2.desplazay(yp-650);
                        modelo3.desplazay(yp);
                        modelo4.desplazay(yp+650);
                    }
                    if(punterom==modelo4)
                    {
                        modelo1.desplazay(yp-1950);
                        modelo2.desplazay(yp-1300);
                        modelo3.desplazay(yp-650);
                        modelo4.desplazay(yp);
                    }
                }
                break;
            case MotionEvent.ACTION_UP:
                break;
        }
        invalidate();
        return true;
    }
}



