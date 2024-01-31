package org.example

class Beguda {
    private var nom:String = ""
    private var preu:Double = 0.0
    private var ensucrat:Boolean = false

    constructor(nom: String,preu: Double,ensucrat: Boolean){
        this.nom=nom
        this.preu=preu
        this.ensucrat=ensucrat
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

    fun getEnsucrat():Boolean{
        return this.ensucrat
    }

    fun getFinalPreu():Double{
        return if(this.ensucrat){
            this.preu*1.1
        }else{
            this.preu
        }
    }

    fun setEnsucrat(ensucrat:Boolean){
        this.ensucrat=ensucrat
    }

    private fun getStringEnsucrat(): String {
        return if(this.ensucrat){
            "Te un suplement del 10% per ser una beguda ensucrada"
        }else{
            "No te un suplement del 10% per ser una beguda ensucrada"
        }
    }
    override fun toString(): String {
        return "Nom: ${this.nom}\nPreu: ${this.getFinalPreu()}\nEnsucrat: ${this.getStringEnsucrat()}\n"
    }


}