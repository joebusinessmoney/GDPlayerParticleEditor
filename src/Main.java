
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String filePath = "D:\\Steam\\steamapps\\common\\Geometry Dash\\Resources\\dragEffect.plist";
        System.out.println("Please enter drag particle amount (0 to turn off, 1000+ may affect performance)");
        Scanner input = new Scanner(System.in);
        int maxParticle = input.nextInt();
        System.out.println(maxParticle);

        try {
            FileWriter editConfig = new FileWriter(filePath);
            editConfig.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<!DOCTYPE plist PUBLIC \"-//Apple//DTD PLIST 1.0//EN\" \"http://www.apple.com/DTDs/PropertyList-1.0.dtd\">\n" +
                    "<plist version=\"1.0\">\n" +
                    "<dict>\n" +
                    "\t<key>angle</key>\n" +
                    "\t<integer>90</integer>\n" +
                    "\t<key>angleVariance</key>\n" +
                    "\t<integer>45</integer>\n" +
                    "\t<key>blendFuncDestination</key>\n" +
                    "\t<integer>1</integer>\n" +
                    "\t<key>blendFuncSource</key>\n" +
                    "\t<integer>770</integer>\n" +
                    "\t<key>duration</key>\n" +
                    "\t<real>-1</real>\n" +
                    "\t<key>emitterType</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>finishColorAlpha</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>finishColorBlue</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>finishColorGreen</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>finishColorRed</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>finishColorVarianceAlpha</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>finishColorVarianceBlue</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>finishColorVarianceGreen</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>finishColorVarianceRed</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>finishParticleSize</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>finishParticleSizeVariance</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>gravityx</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>gravityy</key>\n" +
                    "\t<integer>-300</integer>\n" +
                    "\t<key>maxParticles</key>\n" +
                    "\t<integer>"+ maxParticle + "</integer>\n" +
                    "\t<key>maxRadius</key>\n" +
                    "\t<integer>100</integer>\n" +
                    "\t<key>maxRadiusVariance</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>minRadius</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>particleLifespan</key>\n" +
                    "\t<real>0.3</real>\n" +
                    "\t<key>particleLifespanVariance</key>\n" +
                    "\t<real>0.15</real>\n" +
                    "\t<key>radialAccelVariance</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>radialAcceleration</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>rotatePerSecond</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>rotatePerSecondVariance</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>rotationEnd</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>rotationEndVariance</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>rotationStart</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>rotationStartVariance</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>sourcePositionVariancex</key>\n" +
                    "\t<integer>1</integer>\n" +
                    "\t<key>sourcePositionVariancey</key>\n" +
                    "\t<integer>5</integer>\n" +
                    "\t<key>sourcePositionx</key>\n" +
                    "\t<real>164.104736328125</real>\n" +
                    "\t<key>sourcePositiony</key>\n" +
                    "\t<real>61.31004333496094</real>\n" +
                    "\t<key>speed</key>\n" +
                    "\t<integer>75</integer>\n" +
                    "\t<key>speedVariance</key>\n" +
                    "\t<integer>20</integer>\n" +
                    "\t<key>startColorAlpha</key>\n" +
                    "\t<integer>1</integer>\n" +
                    "\t<key>startColorBlue</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorGreen</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorRed</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorVarianceAlpha</key>\n" +
                    "\t<integer>0</integer>\n" +
                    "\t<key>startColorVarianceBlue</key>\n" +
                    "\t<real>0.100000001490116</real>\n" +
                    "\t<key>startColorVarianceGreen</key>\n" +
                    "\t<real>0.1000000014901161</real>\n" +
                    "\t<key>startColorVarianceRed</key>\n" +
                    "\t<real>0.1000000014901161</real>\n" +
                    "\t<key>startParticleSize</key>\n" +
                    "\t<integer>4</integer>\n" +
                    "\t<key>startParticleSizeVariance</key>\n" +
                    "\t<integer>3</integer>\n" +
                    "\t<key>tangentialAccelVariance</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>tangentialAcceleration</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>textureFileName</key>\n" +
                    "\t<string>square.png</string>\n" +
                    "</dict>\n" +
                    "</plist>\n");
            editConfig.close();
        } catch (IOException e) {
            System.out.println("Error happen :(");
            e.printStackTrace();
        }

        try {
            File ppFile = new File(filePath);
            Scanner fileReader = new Scanner(ppFile);
            while (fileReader.hasNextLine()) {
                String contents = fileReader.nextLine();
                System.out.println(contents);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

    }
}