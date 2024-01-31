package org.example

class Pasta{
    private var nom:String = ""
    private var preu:Double = 0.0
    private var pes:Double = 0.0
    private var kcal:Double = 0.0

    constructor(nom:String,preu:Double,pes:Double,kcal:Double){
        this.nom=nom
        this.preu=preu
        this.pes=pes
        this.kcal=kcal
    }

    fun getNom():String{
        return this.nom
    }

    fun setNom(nom:String){
        this.nom = nom
    }
    fun getPreu():Double{
        return this.preu
    }

    fun setPreu(preu:Double){
        this.preu = preu
    }
    fun getPes():Double{
        return this.pes
    }

    fun setPes(pes:Double){
        this.pes = pes
    }
    fun getKcal():Double{
        return this.kcal
    }

    fun setKcal(kcal:Double){
        this.kcal = kcal
    }

    override fun toString(): String {
        return "Nom: ${this.nom}\nPreu: ${this.preu}\nPes: ${this.pes}\nKcal: ${this.kcal}\n"
    }
}