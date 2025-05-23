package prog2.model;

import prog2.vista.CentralUBException;

import java.io.Serializable;

public class GeneradorVapor implements InComponent, Serializable {

    private boolean activitat;

    public GeneradorVapor() {
        this.activitat = true;
    }

    //METODOS IMPLEMENTADOS

    @Override
    public void activa() {
        this.activitat = true;
    }

    @Override
    public void desactiva() {
        this.activitat = false;
    }

    @Override
    public boolean getActivat() {
        return this.activitat;
    }

    @Override
    public void revisa(PaginaIncidencies p) {
        //NO HACE NADA
    }

    @Override
    public float getCostOperatiu() {
        if(activitat){
            return 25;
        }
        return 0;
    }

    @Override
    public float calculaOutput(float input) {
        if(activitat){
            return input * 0.9f;
        }
        return 25;
    }
}