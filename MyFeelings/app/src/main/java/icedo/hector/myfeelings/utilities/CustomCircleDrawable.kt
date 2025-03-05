package icedo.hector.myfeelings.utilities

import android.content.Context
import android.graphics.Canvas
import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.PixelFormat
import android.graphics.RectF
import android.graphics.drawable.Drawable
import icedo.hector.myfeelings.R

class CustomCircleDrawable:Drawable {

    var coordenadas: RectF? = null
    var anguloBarrido: Float = 0.0f
    var anguloInicio: Float = 0.0f
    var grosorMetrica: Int = 0
    var grosorFondo: Int = 0
    var context: Context?= null
    var emociones = ArrayList<Emociones>()


    constructor(context: Context, emociones: ArrayList<Emociones>){
        this.context = context
        grosorMetrica = context.resources.getDimensionPixelSize(R.dimen.graphWith)
        grosorFondo = context.resources.getDimensionPixelSize(R.dimen.graphBackground)
        this.emociones = emociones
    }

    override fun draw(canvas: Canvas) {

        val fondo: Paint= Paint()
        fondo.style = Paint.Style.STROKE
        fondo.strokeWidth = (this.grosorFondo).toFloat()
        fondo.isAntiAlias = true
        fondo.strokeCap = Paint.Cap.ROUND
        fondo.color= context?.resources?.getColor(R.color.gray)?: R.color.gray
        val ancho : Float = (canvas.width - 25).toFloat()
        val alto: Float =(canvas.height -25).toFloat()

    }

    override fun setAlpha(alpha: Int) {

    }

    override fun setColorFilter(colorFilter: ColorFilter?) {

    }

    override fun getOpacity(): Int {
        return PixelFormat.OPAQUE
    }


}