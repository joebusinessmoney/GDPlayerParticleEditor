
import java.io.*;
import java.util.Scanner;

public class Main {

    static void dragConfig(int dragNum, String dragFilePath) {
        try {                                   // writes new config to file
            FileWriter editDragConfig = new FileWriter(dragFilePath);
            editDragConfig.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
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
                    "\t<integer>" + dragNum + "</integer>\n" +
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
            editDragConfig.close();

            System.out.println("drag config set at " + dragNum);
        } catch (IOException e) {
            System.out.println("error setting drag config :(");
            e.printStackTrace();
        }
    }
    static void landConfig(int landNum, String landFilePath) {
        try {
            FileWriter editLandConfig = new FileWriter(landFilePath);
            editLandConfig.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<!DOCTYPE plist PUBLIC \"-//Apple//DTD PLIST 1.0//EN\" \"http://www.apple.com/DTDs/PropertyList-1.0.dtd\">\n" +
                    "<plist version=\"1.0\">\n" +
                    "<dict>\n" +
                    "\t<key>angle</key>\n" +
                    "\t<real>90</real>\n" +
                    "\t<key>angleVariance</key>\n" +
                    "\t<integer>60</integer>\n" +
                    "\t<key>blendFuncDestination</key>\n" +
                    "\t<integer>1</integer>\n" +
                    "\t<key>blendFuncSource</key>\n" +
                    "\t<integer>770</integer>\n" +
                    "\t<key>duration</key>\n" +
                    "\t<real>0.01999999955296516</real>\n" +
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
                    "\t<integer>-500</integer>\n" +
                    "\t<key>maxParticles</key>\n" +
                    "\t<integer>"+ landNum +"</integer>\n" +
                    "\t<key>maxRadius</key>\n" +
                    "\t<integer>100</integer>\n" +
                    "\t<key>maxRadiusVariance</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>minRadius</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>particleLifespan</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>particleLifespanVariance</key>\n" +
                    "\t<real>0.6000000238418579</real>\n" +
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
                    "\t<integer>10</integer>\n" +
                    "\t<key>sourcePositionVariancey</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>sourcePositionx</key>\n" +
                    "\t<real>165.6644134521484</real>\n" +
                    "\t<key>sourcePositiony</key>\n" +
                    "\t<real>57.47816467285156</real>\n" +
                    "\t<key>speed</key>\n" +
                    "\t<integer>150</integer>\n" +
                    "\t<key>speedVariance</key>\n" +
                    "\t<integer>25</integer>\n" +
                    "\t<key>startColorAlpha</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorBlue</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorGreen</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorRed</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorVarianceAlpha</key>\n" +
                    "\t<real>0.5</real>\n" +
                    "\t<key>startColorVarianceBlue</key>\n" +
                    "\t<real>0.1000000014901161</real>\n" +
                    "\t<key>startColorVarianceGreen</key>\n" +
                    "\t<real>0.1000000014901161</real>\n" +
                    "\t<key>startColorVarianceRed</key>\n" +
                    "\t<real>0.1000000014901161</real>\n" +
                    "\t<key>startParticleSize</key>\n" +
                    "\t<integer>5</integer>\n" +
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
            editLandConfig.close();
            System.out.println("land particle config set at " + landNum);
        } catch (IOException e) {
            System.out.println("issue with applying land config :(");
            e.printStackTrace();
        }

    }
    static void shipConfig(int shipNum, String shipFilePath) {
        try {
            FileWriter editShipConfig = new FileWriter(shipFilePath);
            editShipConfig.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<!DOCTYPE plist PUBLIC \"-//Apple//DTD PLIST 1.0//EN\" \"http://www.apple.com/DTDs/PropertyList-1.0.dtd\">\n" +
                    "<plist version=\"1.0\">\n" +
                    "<dict>\n" +
                    "\t<key>angle</key>\n" +
                    "\t<real>110</real>\n" +
                    "\t<key>angleVariance</key>\n" +
                    "\t<real>45</real>\n" +
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
                    "\t<integer>-350</integer>\n" +
                    "\t<key>gravityy</key>\n" +
                    "\t<integer>-300</integer>\n" +
                    "\t<key>maxParticles</key>\n" +
                    "\t<real>" + shipNum + "</real>\n" +
                    "\t<key>maxRadius</key>\n" +
                    "\t<real>100</real>\n" +
                    "\t<key>maxRadiusVariance</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>minRadius</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>particleLifespan</key>\n" +
                    "\t<real>0.300000011920929</real>\n" +
                    "\t<key>particleLifespanVariance</key>\n" +
                    "\t<real>0.1500000059604645</real>\n" +
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
                    "\t<integer>9</integer>\n" +
                    "\t<key>sourcePositionVariancey</key>\n" +
                    "\t<integer>1</integer>\n" +
                    "\t<key>sourcePositionx</key>\n" +
                    "\t<real>309.7015686035156</real>\n" +
                    "\t<key>sourcePositiony</key>\n" +
                    "\t<real>62.04694366455078</real>\n" +
                    "\t<key>speed</key>\n" +
                    "\t<real>94.62376403808594</real>\n" +
                    "\t<key>speedVariance</key>\n" +
                    "\t<real>20</real>\n" +
                    "\t<key>startColorAlpha</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorBlue</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorGreen</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorRed</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorVarianceAlpha</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>startColorVarianceBlue</key>\n" +
                    "\t<real>0.1000000014901161</real>\n" +
                    "\t<key>startColorVarianceGreen</key>\n" +
                    "\t<real>0.1000000014901161</real>\n" +
                    "\t<key>startColorVarianceRed</key>\n" +
                    "\t<real>0.1000000014901161</real>\n" +
                    "\t<key>startParticleSize</key>\n" +
                    "\t<real>3</real>\n" +
                    "\t<key>startParticleSizeVariance</key>\n" +
                    "\t<real>2</real>\n" +
                    "\t<key>tangentialAccelVariance</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>tangentialAcceleration</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>textureFileName</key>\n" +
                    "\t<string>square.png</string>\n" +
                    "</dict>\n" +
                    "</plist>\n");
            editShipConfig.close();
            System.out.println("ship particle config set at " + shipNum);
        } catch (IOException e) {
            System.out.println("issue with applying ship config :(");
            e.printStackTrace();
        }
    }
    static void swingConfig(int swingNum, String swingFilePath) {
        try {                                   // writes new config to file
            FileWriter editSwingConfig = new FileWriter(swingFilePath);

            editSwingConfig.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<!DOCTYPE plist PUBLIC \"-//Apple//DTD PLIST 1.0//EN\" \"http://www.apple.com/DTDs/PropertyList-1.0.dtd\">\n" +
                    "<plist version=\"1.0\">\n" +
                    "<dict>\n" +
                    "\t<key>angle</key>\n" +
                    "\t<integer>0</integer>\n" +
                    "\t<key>angleVariance</key>\n" +
                    "\t<integer>10</integer>\n" +
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
                    "\t<real>1</real>\n" +
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
                    "\t<real>0</real>\n" +
                    "\t<key>maxParticles</key>\n" +
                    "\t<integer>" + swingNum + "</integer>\n" +
                    "\t<key>maxRadius</key>\n" +
                    "\t<integer>100</integer>\n" +
                    "\t<key>maxRadiusVariance</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>minRadius</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>particleLifespan</key>\n" +
                    "\t<real>0.14</real>\n" +
                    "\t<key>particleLifespanVariance</key>\n" +
                    "\t<real>0.04</real>\n" +
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
                    "\t<integer>2</integer>\n" +
                    "\t<key>sourcePositionVariancey</key>\n" +
                    "\t<integer>2</integer>\n" +
                    "\t<key>sourcePositionx</key>\n" +
                    "\t<real>317.3817443847656</real>\n" +
                    "\t<key>sourcePositiony</key>\n" +
                    "\t<real>189.6997833251953</real>\n" +
                    "\t<key>speed</key>\n" +
                    "\t<integer>200</integer>\n" +
                    "\t<key>speedVariance</key>\n" +
                    "\t<integer>50</integer>\n" +
                    "\t<key>startColorAlpha</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorBlue</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorGreen</key>\n" +
                    "\t<real>0.5120442509651184</real>\n" +
                    "\t<key>startColorRed</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>startColorVarianceAlpha</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>startColorVarianceBlue</key>\n" +
                    "\t<real>0.1000000014901161</real>\n" +
                    "\t<key>startColorVarianceGreen</key>\n" +
                    "\t<real>0.1000000014901161</real>\n" +
                    "\t<key>startColorVarianceRed</key>\n" +
                    "\t<real>0.1000000014901161</real>\n" +
                    "\t<key>startParticleSize</key>\n" +
                    "\t<integer>4</integer>\n" +
                    "\t<key>startParticleSizeVariance</key>\n" +
                    "\t<integer>2</integer>\n" +
                    "\t<key>tangentialAccelVariance</key>\n" +
                    "\t<integer>0</integer>\n" +
                    "\t<key>tangentialAcceleration</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>textureFileName</key>\n" +
                    "\t<string>square.png</string>\n" +
                    "</dict>\n" +
                    "</plist>\n");
            editSwingConfig.close();

            System.out.println("swing particle config set at " + swingNum);
        } catch (IOException e) {
            System.out.println("issue setting swing particle config :(");
            e.printStackTrace();
        }
    }
    static void burstConfig(int burstNum, String burstFilePath) {
        try {
            FileWriter editBurstConfig = new FileWriter(burstFilePath);
            editBurstConfig.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<!DOCTYPE plist PUBLIC \"-//Apple//DTD PLIST 1.0//EN\" \"http://www.apple.com/DTDs/PropertyList-1.0.dtd\">\n" +
                    "<plist version=\"1.0\">\n" +
                    "<dict>\n" +
                    "\t<key>angle</key>\n" +
                    "\t<integer>0</integer>\n" +
                    "\t<key>angleVariance</key>\n" +
                    "\t<integer>10</integer>\n" +
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
                    "\t<real>1</real>\n" +
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
                    "\t<real>0</real>\n" +
                    "\t<key>maxParticles</key>\n" +
                    "\t<integer>" + burstNum + "</integer>\n" +
                    "\t<key>maxRadius</key>\n" +
                    "\t<integer>100</integer>\n" +
                    "\t<key>maxRadiusVariance</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>minRadius</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>particleLifespan</key>\n" +
                    "\t<real>0.14</real>\n" +
                    "\t<key>particleLifespanVariance</key>\n" +
                    "\t<real>0.04</real>\n" +
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
                    "\t<integer>2</integer>\n" +
                    "\t<key>sourcePositionVariancey</key>\n" +
                    "\t<integer>2</integer>\n" +
                    "\t<key>sourcePositionx</key>\n" +
                    "\t<real>317.3817443847656</real>\n" +
                    "\t<key>sourcePositiony</key>\n" +
                    "\t<real>189.6997833251953</real>\n" +
                    "\t<key>speed</key>\n" +
                    "\t<integer>200</integer>\n" +
                    "\t<key>speedVariance</key>\n" +
                    "\t<integer>50</integer>\n" +
                    "\t<key>startColorAlpha</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorBlue</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorGreen</key>\n" +
                    "\t<real>0.5120442509651184</real>\n" +
                    "\t<key>startColorRed</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>startColorVarianceAlpha</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>startColorVarianceBlue</key>\n" +
                    "\t<real>0.1000000014901161</real>\n" +
                    "\t<key>startColorVarianceGreen</key>\n" +
                    "\t<real>0.1000000014901161</real>\n" +
                    "\t<key>startColorVarianceRed</key>\n" +
                    "\t<real>0.1000000014901161</real>\n" +
                    "\t<key>startParticleSize</key>\n" +
                    "\t<integer>4</integer>\n" +
                    "\t<key>startParticleSizeVariance</key>\n" +
                    "\t<integer>2</integer>\n" +
                    "\t<key>tangentialAccelVariance</key>\n" +
                    "\t<integer>0</integer>\n" +
                    "\t<key>tangentialAcceleration</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>textureFileName</key>\n" +
                    "\t<string>square.png</string>\n" +
                    "</dict>\n" +
                    "</plist>\n");
            editBurstConfig.close();

            System.out.println("swing particle config set at " + burstNum);
        } catch (IOException e) {
            System.out.println("issue setting swing particle config :(");
            e.printStackTrace();
        }
    }
    static void robotConfig(int robotNum, String robotFilePath) {
        try {
            FileWriter editRobotConfig = new FileWriter(robotFilePath);
            editRobotConfig.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<!DOCTYPE plist PUBLIC \"-//Apple//DTD PLIST 1.0//EN\" \"http://www.apple.com/DTDs/PropertyList-1.0.dtd\">\n" +
                    "<plist version=\"1.0\">\n" +
                    "<dict>\n" +
                    "\t<key>angle</key>\n" +
                    "\t<real>330</real>\n" +
                    "\t<key>angleVariance</key>\n" +
                    "\t<real>45</real>\n" +
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
                    "\t<real>1</real>\n" +
                    "\t<key>finishColorRed</key>\n" +
                    "\t<real>1</real>\n" +
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
                    "\t<real>0</real>\n" +
                    "\t<key>maxParticles</key>\n" +
                    "\t<real>" + robotNum + "</real>\n" +
                    "\t<key>maxRadius</key>\n" +
                    "\t<real>100</real>\n" +
                    "\t<key>maxRadiusVariance</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>minRadius</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>particleLifespan</key>\n" +
                    "\t<real>0.4000000059604645</real>\n" +
                    "\t<key>particleLifespanVariance</key>\n" +
                    "\t<real>0.1000000014901161</real>\n" +
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
                    "\t<real>5</real>\n" +
                    "\t<key>sourcePositionVariancey</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>sourcePositionx</key>\n" +
                    "\t<real>147.5450439453125</real>\n" +
                    "\t<key>sourcePositiony</key>\n" +
                    "\t<real>321.4595642089844</real>\n" +
                    "\t<key>speed</key>\n" +
                    "\t<real>10</real>\n" +
                    "\t<key>speedVariance</key>\n" +
                    "\t<real>5</real>\n" +
                    "\t<key>startColorAlpha</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorBlue</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>startColorGreen</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>startColorRed</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorVarianceAlpha</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>startColorVarianceBlue</key>\n" +
                    "\t<real>0.1000000014901161</real>\n" +
                    "\t<key>startColorVarianceGreen</key>\n" +
                    "\t<real>0.1000000014901161</real>\n" +
                    "\t<key>startColorVarianceRed</key>\n" +
                    "\t<real>0.1000000014901161</real>\n" +
                    "\t<key>startParticleSize</key>\n" +
                    "\t<real>8</real>\n" +
                    "\t<key>startParticleSizeVariance</key>\n" +
                    "\t<real>2</real>\n" +
                    "\t<key>tangentialAccelVariance</key>\n" +
                    "\t<real>600</real>\n" +
                    "\t<key>tangentialAcceleration</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>textureFileName</key>\n" +
                    "\t<string>square.png</string>\n" +
                    "</dict>\n" +
                    "</plist>\n");
            editRobotConfig.close();

            System.out.println("swing particle config set at " + robotNum);
        } catch (IOException e) {
            System.out.println("issue setting swing particle config :(");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        String dragFilePath = "D:\\Steam\\steamapps\\common\\Geometry Dash\\Resources\\dragEffect.plist"; //default 30
        String landFilePath = "D:\\Steam\\steamapps\\common\\Geometry Dash\\Resources\\landEffect.plist"; //default 10
        String shipFilePath = "D:\\Steam\\steamapps\\common\\Geometry Dash\\Resources\\shipDragEffect.plist"; //default 40
        String swingFilePath = "D:\\Steam\\steamapps\\common\\Geometry Dash\\Resources\\swingBurstEffect.plist"; //default 10
        String burstFilePath = "D:\\Steam\\steamapps\\common\\Geometry Dash\\Resources\\burstEffect.plist"; //default 50
        String robotFilePath = "D:\\Steam\\steamapps\\common\\Geometry Dash\\Resources\\burstEffect2.plist"; //default 50

        int dragParticles = 30;
        int landParticles = 10;
        int shipParticles = 40;
        int swingParticles = 10;
        int burstParticles = 50;
        int robotParticles = 50;


        System.out.println("Please enter drag particle amount (0 to turn off, default is 30, 1000+ may affect performance)");
        Scanner dragInput = new Scanner(System.in);
        dragParticles = dragInput.nextInt();
        dragConfig(dragParticles, dragFilePath);
        System.out.println(dragParticles);

        System.out.println("Please enter land particle amount (0 to turn off, default is 10, 1000+ may affect performance)");
        Scanner landInput = new Scanner(System.in);
        landParticles = landInput.nextInt();
        landConfig(landParticles, landFilePath);
        System.out.println(landParticles);

        System.out.println("Please enter ship particle amount (0 to turn off, default is 40, 1000+ may affect performance)");
        Scanner shipInput = new Scanner(System.in);
        shipParticles = shipInput.nextInt();
        shipConfig(shipParticles, shipFilePath);
        System.out.println(shipParticles);

        System.out.println("Please enter swing particle amount (0 to turn off, default is 10, 1000+ may affect performance)");
        Scanner swingInput = new Scanner(System.in);
        swingParticles = swingInput.nextInt();
        swingConfig(swingParticles, swingFilePath);
        System.out.println(swingParticles);

        System.out.println("Please enter ufo burst particle amount (0 to turn off, default is 50, 1000+ may affect performance)");
        Scanner burstInput = new Scanner(System.in);
        burstParticles = burstInput.nextInt();
        burstConfig(burstParticles, burstFilePath);
        System.out.println(burstParticles);

        System.out.println("Please enter robot burst particle amount (0 to turn off, default is 50, 1000+ may affect performance)");
        Scanner robotInput = new Scanner(System.in);
        robotParticles = robotInput.nextInt();
        robotConfig(robotParticles, robotFilePath);
        System.out.println(robotParticles);


        try {                               // prints the contents of the dragEffect file to the terminal
            File ppFile = new File(dragFilePath);
            Scanner fileReader = new Scanner(ppFile);
            while (fileReader.hasNextLine()) {
                String contents = fileReader.nextLine();
                // System.out.println(contents);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}