package CreationalDP.FactoryDP;

public class ShapeFactory {

    public Shape getShape(String shapeType){

        if (shapeType==null){
            return null;
        }
        if (shapeType.equalsIgnoreCase("daire")){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("dikdörtgen")){
            return new Rectangle();
        }else if (shapeType.equalsIgnoreCase("kare")){
            return new Square();
        }
        return null;

    }

}
