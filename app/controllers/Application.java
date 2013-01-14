package controllers;

import play.*;
import play.mvc.*;
import play.data.Form;

import views.html.*;

import models.MyModel;

public class Application extends Controller {

    public static Result index() {
        Form form = Form.form( MyModel.class, MyModel.NameNotRequired.class ).fill( new MyModel("test") );
        return ok( index.render( form ) );
    }

}
