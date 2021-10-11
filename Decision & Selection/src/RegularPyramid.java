import javax.swing.JOptionPane;

import static java.lang.Math.*;

/*
Description:
* Write a program to calculate the volume and surface areas of a regular pyramid shape based on
the user input of base and height.
*/
public class RegularPyramid {

    public static void main(String[] args) {

        //declare variables
        String result;
        double base, height;

        // Create a DecimalFormat object.
        //DecimalFormat dec = new DecimalFormat("###.##");

        //input
        base = Double.parseDouble(JOptionPane.showInputDialog("Enter the base: "));
        height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height: "));

        //declare variables
        double b = base / 2;
        double a = (height * height) + Math.pow(b, 2);

        //define constant
        final double SLANT_HEIGHT;
        final double VOLUME;
        final double BASE_SURFACE_AREA;
        final double LATERIAL_SURFACE_AREA;
        final double TOTAL_SURFACE_AREA;


        if (base <= 0 || height <= 0) {
            System.out.println("Invalid input! Both base and height must be greater than 0.");
        } else { //VALID INPUT CALCULATE
            // CALCULATE
            SLANT_HEIGHT = sqrt(a);
            VOLUME = (float) (1.0 / 3) * base * base * height;
            BASE_SURFACE_AREA = base * base;
            LATERIAL_SURFACE_AREA = 4 * ((base * SLANT_HEIGHT) / 2);
            TOTAL_SURFACE_AREA = LATERIAL_SURFACE_AREA + BASE_SURFACE_AREA;

            //PRINT
            result = "Base: " + base
                             + "\n" + "Height: " + height
                             + "\n" + "***********************"
                             + "\n" + "Slant Height: " + SLANT_HEIGHT
                             + "\n" + "Volume: " + VOLUME
                             + "\n" + "Base Surface Area: " + BASE_SURFACE_AREA
                             + "\n" + "Laterial Surface Area: " + LATERIAL_SURFACE_AREA
                             + "\n" + "Total Surface Area: " + TOTAL_SURFACE_AREA;


            JOptionPane.showMessageDialog(null, result); //null is the parent object

            System.exit(0);


        }
    }
}