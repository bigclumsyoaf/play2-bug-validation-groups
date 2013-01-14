package models;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.data.Form;

public class MyModel extends Model
{

  @Constraints.Required(groups={ NameRequired.class })
  private String name;

  public MyModel()
  {
  }

  public MyModel( String name )
  {
    this.name = name;
  }

  public String getName()
  {
    return this.name;
  }

  public void setName( String name )
  {
    this.name = name;
  }

  public static class NameRequired {
  }

  public static class NameNotRequired {
  }

}

