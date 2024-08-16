package GDPPE;

import java.io.*;
import java.util.Scanner;

public class Main {

    static void dragConfig(int dragNum, String dragFilePath, String particleShape) {
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
                    "\t<string>" + particleShape + ".png</string>\n" +
                    "</dict>\n" +
                    "</plist>\n");
            editDragConfig.close();

            System.out.println("drag config set at " + dragNum);
            System.out.println("particle shape " + particleShape);
        } catch (IOException e) {
            System.out.println("error setting drag config :(");
            e.printStackTrace();
        }
    }
    static void landConfig(int landNum, String landFilePath, String particleShape) {
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
                    "\t<string>"+particleShape+".png</string>\n" +
                    "</dict>\n" +
                    "</plist>\n");
            editLandConfig.close();
            System.out.println("land particle config set at " + landNum);
        } catch (IOException e) {
            System.out.println("issue with applying land config :(");
            e.printStackTrace();
        }

    }
    static void shipConfig(int shipNum, String shipFilePath, String particleShape) {
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
                    "\t<string>"+particleShape+".png</string>\n" +
                    "</dict>\n" +
                    "</plist>\n");
            editShipConfig.close();
            System.out.println("ship particle config set at " + shipNum);
        } catch (IOException e) {
            System.out.println("issue with applying ship config :(");
            e.printStackTrace();
        }
    }
    static void swingConfig(int swingNum, String swingFilePath, String particleShape) {
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
                    "\t<string>"+particleShape+".png</string>\n" +
                    "</dict>\n" +
                    "</plist>\n");
            editSwingConfig.close();

            System.out.println("swing particle config set at " + swingNum);
        } catch (IOException e) {
            System.out.println("issue setting swing particle config :(");
            e.printStackTrace();
        }
    }
    static void burstConfig(int burstNum, String burstFilePath, String particleShape) {
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
                    "\t<string>"+particleShape+".png</string>\n" +
                    "</dict>\n" +
                    "</plist>\n");
            editBurstConfig.close();

            System.out.println("burst particle config set at " + burstNum);
        } catch (IOException e) {
            System.out.println("issue setting burst particle config :(");
            e.printStackTrace();
        }
    }
    static void robotConfig(int robotNum, String robotFilePath, String particleShape) {
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
                    "\t<string>"+particleShape+".png</string>\n" +
                    "</dict>\n" +
                    "</plist>\n");
            editRobotConfig.close();

            System.out.println("robot particle config set at " + robotNum);
        } catch (IOException e) {
            System.out.println("issue setting robot particle config :(");
            e.printStackTrace();
        }
    }
    static void orbConfig(int orbNum, String orbFilePath, String particleShape) {
        try {
            FileWriter editOrbConfig = new FileWriter(orbFilePath);
            editOrbConfig.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<!DOCTYPE plist PUBLIC \"-//Apple//DTD PLIST 1.0//EN\" \"http://www.apple.com/DTDs/PropertyList-1.0.dtd\">\n" +
                    "<plist version=\"1.0\">\n" +
                    "<dict>\n" +
                    "\t<key>angle</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>angleVariance</key>\n" +
                    "\t<real>360</real>\n" +
                    "\t<key>blendFuncDestination</key>\n" +
                    "\t<integer>1</integer>\n" +
                    "\t<key>blendFuncSource</key>\n" +
                    "\t<integer>770</integer>\n" +
                    "\t<key>duration</key>\n" +
                    "\t<real>-1</real>\n" +
                    "\t<key>emitterType</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>finishColorAlpha</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>finishColorBlue</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>finishColorGreen</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>finishColorRed</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>finishColorVarianceAlpha</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>finishColorVarianceBlue</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>finishColorVarianceGreen</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>finishColorVarianceRed</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>finishParticleSize</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>finishParticleSizeVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>gravityx</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>gravityy</key>\n" +
                    "\t<real>-300</real>\n" +
                    "\t<key>maxParticles</key>\n" +
                    "\t<real> " + orbNum + "</real>\n" +
                    "\t<key>maxRadius</key>\n" +
                    "\t<real>20</real>\n" +
                    "\t<key>maxRadiusVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>minRadius</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>particleLifespan</key>\n" +
                    "\t<real>0.30000001192092896</real>\n" +
                    "\t<key>particleLifespanVariance</key>\n" +
                    "\t<real>0.10000000149011612</real>\n" +
                    "\t<key>radialAccelVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>radialAcceleration</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotatePerSecond</key>\n" +
                    "\t<real>360</real>\n" +
                    "\t<key>rotatePerSecondVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotationEnd</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotationEndVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotationStart</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotationStartVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>sourcePositionVariancex</key>\n" +
                    "\t<real>3</real>\n" +
                    "\t<key>sourcePositionVariancey</key>\n" +
                    "\t<real>5</real>\n" +
                    "\t<key>sourcePositionx</key>\n" +
                    "\t<real>153.6148681640625</real>\n" +
                    "\t<key>sourcePositiony</key>\n" +
                    "\t<real>175.31658935546875</real>\n" +
                    "\t<key>speed</key>\n" +
                    "\t<real>75</real>\n" +
                    "\t<key>speedVariance</key>\n" +
                    "\t<real>20</real>\n" +
                    "\t<key>startColorAlpha</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>startColorBlue</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorGreen</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorRed</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorVarianceAlpha</key>\n" +
                    "\t<real>0.69812500476837158</real>\n" +
                    "\t<key>startColorVarianceBlue</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>startColorVarianceGreen</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>startColorVarianceRed</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>startParticleSize</key>\n" +
                    "\t<real>4</real>\n" +
                    "\t<key>startParticleSizeVariance</key>\n" +
                    "\t<real>2</real>\n" +
                    "\t<key>tangentialAccelVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>tangentialAcceleration</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>textureFileName</key>\n" +
                    "\t<string>"+particleShape+".png</string>\n" +
                    "</dict>\n" +
                    "</plist>\n");
            editOrbConfig.close();

            System.out.println("orb particle config set at " + orbNum);
        } catch (IOException e) {
            System.out.println("issue setting orb particle config :(");
            e.printStackTrace();
        }
    }
    static void portalConfig (int portalNum, String filePath, String particleShape) {
        try {
            FileWriter editP1Config = new FileWriter(filePath + "portalEffect01.plist");
            editP1Config.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<!DOCTYPE plist PUBLIC \"-//Apple//DTD PLIST 1.0//EN\" \"http://www.apple.com/DTDs/PropertyList-1.0.dtd\">\n" +
                    "<plist version=\"1.0\">\n" +
                    "<dict>\n" +
                    "\t<key>angle</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>angleVariance</key>\n" +
                    "\t<real>95</real>\n" +
                    "\t<key>blendFuncDestination</key>\n" +
                    "\t<integer>1</integer>\n" +
                    "\t<key>blendFuncSource</key>\n" +
                    "\t<integer>770</integer>\n" +
                    "\t<key>duration</key>\n" +
                    "\t<real>-1</real>\n" +
                    "\t<key>emitterType</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>finishColorAlpha</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>finishColorBlue</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>finishColorGreen</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>finishColorRed</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>finishColorVarianceAlpha</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>finishColorVarianceBlue</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>finishColorVarianceGreen</key>\n" +
                    "\t<real>0.5</real>\n" +
                    "\t<key>finishColorVarianceRed</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>finishParticleSize</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>finishParticleSizeVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>gravityx</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>gravityy</key>\n" +
                    "\t<real>-300</real>\n" +
                    "\t<key>maxParticles</key>\n" +
                    "\t<real>"+ portalNum +"</real>\n" +
                    "\t<key>maxRadius</key>\n" +
                    "\t<real>40</real>\n" +
                    "\t<key>maxRadiusVariance</key>\n" +
                    "\t<real>20</real>\n" +
                    "\t<key>minRadius</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>particleLifespan</key>\n" +
                    "\t<real>0.60000002384185791</real>\n" +
                    "\t<key>particleLifespanVariance</key>\n" +
                    "\t<real>0.40000000596046448</real>\n" +
                    "\t<key>radialAccelVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>radialAcceleration</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotatePerSecond</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotatePerSecondVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotationEnd</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotationEndVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotationStart</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotationStartVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>sourcePositionVariancex</key>\n" +
                    "\t<real>3</real>\n" +
                    "\t<key>sourcePositionVariancey</key>\n" +
                    "\t<real>5</real>\n" +
                    "\t<key>sourcePositionx</key>\n" +
                    "\t<real>252.409912109375</real>\n" +
                    "\t<key>sourcePositiony</key>\n" +
                    "\t<real>160.08187866210938</real>\n" +
                    "\t<key>speed</key>\n" +
                    "\t<real>75</real>\n" +
                    "\t<key>speedVariance</key>\n" +
                    "\t<real>20</real>\n" +
                    "\t<key>startColorAlpha</key>\n" +
                    "\t<real>0.5</real>\n" +
                    "\t<key>startColorBlue</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorGreen</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorRed</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>startColorVarianceAlpha</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>startColorVarianceBlue</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>startColorVarianceGreen</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>startColorVarianceRed</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>startParticleSize</key>\n" +
                    "\t<real>6</real>\n" +
                    "\t<key>startParticleSizeVariance</key>\n" +
                    "\t<real>2</real>\n" +
                    "\t<key>tangentialAccelVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>tangentialAcceleration</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>textureFileName</key>\n" +
                    "\t<string>" + particleShape + "</string>\n" +
                    "</dict>\n" +
                    "</plist>\n");
            editP1Config.close();

            FileWriter editP2Config = new FileWriter(filePath + "portalEffect02.plist");
            editP2Config.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<!DOCTYPE plist PUBLIC \"-//Apple//DTD PLIST 1.0//EN\" \"http://www.apple.com/DTDs/PropertyList-1.0.dtd\">\n" +
                    "<plist version=\"1.0\">\n" +
                    "<dict>\n" +
                    "\t<key>angle</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>angleVariance</key>\n" +
                    "\t<real>95</real>\n" +
                    "\t<key>blendFuncDestination</key>\n" +
                    "\t<integer>1</integer>\n" +
                    "\t<key>blendFuncSource</key>\n" +
                    "\t<integer>770</integer>\n" +
                    "\t<key>duration</key>\n" +
                    "\t<real>-1</real>\n" +
                    "\t<key>emitterType</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>finishColorAlpha</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>finishColorBlue</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>finishColorGreen</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>finishColorRed</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>finishColorVarianceAlpha</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>finishColorVarianceBlue</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>finishColorVarianceGreen</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>finishColorVarianceRed</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>finishParticleSize</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>finishParticleSizeVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>gravityx</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>gravityy</key>\n" +
                    "\t<real>-300</real>\n" +
                    "\t<key>maxParticles</key>\n" +
                    "\t<real>"+portalNum+"</real>\n" +
                    "\t<key>maxRadius</key>\n" +
                    "\t<real>40</real>\n" +
                    "\t<key>maxRadiusVariance</key>\n" +
                    "\t<real>20</real>\n" +
                    "\t<key>minRadius</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>particleLifespan</key>\n" +
                    "\t<real>0.60000002384185791</real>\n" +
                    "\t<key>particleLifespanVariance</key>\n" +
                    "\t<real>0.40000000596046448</real>\n" +
                    "\t<key>radialAccelVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>radialAcceleration</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotatePerSecond</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotatePerSecondVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotationEnd</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotationEndVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotationStart</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotationStartVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>sourcePositionVariancex</key>\n" +
                    "\t<real>3</real>\n" +
                    "\t<key>sourcePositionVariancey</key>\n" +
                    "\t<real>5</real>\n" +
                    "\t<key>sourcePositionx</key>\n" +
                    "\t<real>373.9696044921875</real>\n" +
                    "\t<key>sourcePositiony</key>\n" +
                    "\t<real>161.35917663574219</real>\n" +
                    "\t<key>speed</key>\n" +
                    "\t<real>75</real>\n" +
                    "\t<key>speedVariance</key>\n" +
                    "\t<real>20</real>\n" +
                    "\t<key>startColorAlpha</key>\n" +
                    "\t<real>0.5</real>\n" +
                    "\t<key>startColorBlue</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>startColorGreen</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorRed</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorVarianceAlpha</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>startColorVarianceBlue</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>startColorVarianceGreen</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>startColorVarianceRed</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>startParticleSize</key>\n" +
                    "\t<real>6</real>\n" +
                    "\t<key>startParticleSizeVariance</key>\n" +
                    "\t<real>2</real>\n" +
                    "\t<key>tangentialAccelVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>tangentialAcceleration</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>textureFileName</key>\n" +
                    "\t<string>" +particleShape+"</string>\n" +
                    "</dict>\n" +
                    "</plist>\n");
            editP2Config.close();

            FileWriter editP3Config = new FileWriter(filePath + "portalEffect03.plist");
            editP3Config.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<!DOCTYPE plist PUBLIC \"-//Apple//DTD PLIST 1.0//EN\" \"http://www.apple.com/DTDs/PropertyList-1.0.dtd\">\n" +
                    "<plist version=\"1.0\">\n" +
                    "<dict>\n" +
                    "\t<key>angle</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>angleVariance</key>\n" +
                    "\t<real>95</real>\n" +
                    "\t<key>blendFuncDestination</key>\n" +
                    "\t<integer>1</integer>\n" +
                    "\t<key>blendFuncSource</key>\n" +
                    "\t<integer>770</integer>\n" +
                    "\t<key>duration</key>\n" +
                    "\t<real>-1</real>\n" +
                    "\t<key>emitterType</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>finishColorAlpha</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>finishColorBlue</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>finishColorGreen</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>finishColorRed</key>\n" +
                    "\t<real>0.30000001192092896</real>\n" +
                    "\t<key>finishColorVarianceAlpha</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>finishColorVarianceBlue</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>finishColorVarianceGreen</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>finishColorVarianceRed</key>\n" +
                    "\t<real>0.30000001192092896</real>\n" +
                    "\t<key>finishParticleSize</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>finishParticleSizeVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>gravityx</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>gravityy</key>\n" +
                    "\t<real>-300</real>\n" +
                    "\t<key>maxParticles</key>\n" +
                    "\t<real>"+portalNum+"</real>\n" +
                    "\t<key>maxRadius</key>\n" +
                    "\t<real>40</real>\n" +
                    "\t<key>maxRadiusVariance</key>\n" +
                    "\t<real>20</real>\n" +
                    "\t<key>minRadius</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>particleLifespan</key>\n" +
                    "\t<real>0.60000002384185791</real>\n" +
                    "\t<key>particleLifespanVariance</key>\n" +
                    "\t<real>0.40000000596046448</real>\n" +
                    "\t<key>radialAccelVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>radialAcceleration</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotatePerSecond</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotatePerSecondVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotationEnd</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotationEndVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotationStart</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotationStartVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>sourcePositionVariancex</key>\n" +
                    "\t<real>3</real>\n" +
                    "\t<key>sourcePositionVariancey</key>\n" +
                    "\t<real>5</real>\n" +
                    "\t<key>sourcePositionx</key>\n" +
                    "\t<real>282.08334350585938</real>\n" +
                    "\t<key>sourcePositiony</key>\n" +
                    "\t<real>162.47816467285156</real>\n" +
                    "\t<key>speed</key>\n" +
                    "\t<real>75</real>\n" +
                    "\t<key>speedVariance</key>\n" +
                    "\t<real>20</real>\n" +
                    "\t<key>startColorAlpha</key>\n" +
                    "\t<real>0.5</real>\n" +
                    "\t<key>startColorBlue</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>startColorGreen</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorRed</key>\n" +
                    "\t<real>0.30000001192092896</real>\n" +
                    "\t<key>startColorVarianceAlpha</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>startColorVarianceBlue</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>startColorVarianceGreen</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>startColorVarianceRed</key>\n" +
                    "\t<real>0.30000001192092896</real>\n" +
                    "\t<key>startParticleSize</key>\n" +
                    "\t<real>6</real>\n" +
                    "\t<key>startParticleSizeVariance</key>\n" +
                    "\t<real>2</real>\n" +
                    "\t<key>tangentialAccelVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>tangentialAcceleration</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>textureFileName</key>\n" +
                    "\t<string>"+particleShape+"</string>\n" +
                    "</dict>\n" +
                    "</plist>\n");
            editP3Config.close();

            FileWriter editP4Config = new FileWriter(filePath + "portalEffect04.plist");
            editP4Config.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<!DOCTYPE plist PUBLIC \"-//Apple//DTD PLIST 1.0//EN\" \"http://www.apple.com/DTDs/PropertyList-1.0.dtd\">\n" +
                    "<plist version=\"1.0\">\n" +
                    "<dict>\n" +
                    "\t<key>angle</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>angleVariance</key>\n" +
                    "\t<real>95</real>\n" +
                    "\t<key>blendFuncDestination</key>\n" +
                    "\t<integer>1</integer>\n" +
                    "\t<key>blendFuncSource</key>\n" +
                    "\t<integer>770</integer>\n" +
                    "\t<key>duration</key>\n" +
                    "\t<real>-1</real>\n" +
                    "\t<key>emitterType</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>finishColorAlpha</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>finishColorBlue</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>finishColorGreen</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>finishColorRed</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>finishColorVarianceAlpha</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>finishColorVarianceBlue</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>finishColorVarianceGreen</key>\n" +
                    "\t<real>0.30000001192092896</real>\n" +
                    "\t<key>finishColorVarianceRed</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>finishParticleSize</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>finishParticleSizeVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>gravityx</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>gravityy</key>\n" +
                    "\t<real>-300</real>\n" +
                    "\t<key>maxParticles</key>\n" +
                    "\t<real>"+portalNum+"</real>\n" +
                    "\t<key>maxRadius</key>\n" +
                    "\t<real>40</real>\n" +
                    "\t<key>maxRadiusVariance</key>\n" +
                    "\t<real>20</real>\n" +
                    "\t<key>minRadius</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>particleLifespan</key>\n" +
                    "\t<real>0.60000002384185791</real>\n" +
                    "\t<key>particleLifespanVariance</key>\n" +
                    "\t<real>0.40000000596046448</real>\n" +
                    "\t<key>radialAccelVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>radialAcceleration</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotatePerSecond</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotatePerSecondVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotationEnd</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotationEndVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotationStart</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>rotationStartVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>sourcePositionVariancex</key>\n" +
                    "\t<real>3</real>\n" +
                    "\t<key>sourcePositionVariancey</key>\n" +
                    "\t<real>5</real>\n" +
                    "\t<key>sourcePositionx</key>\n" +
                    "\t<real>402.40426635742188</real>\n" +
                    "\t<key>sourcePositiony</key>\n" +
                    "\t<real>166.10807800292969</real>\n" +
                    "\t<key>speed</key>\n" +
                    "\t<real>75</real>\n" +
                    "\t<key>speedVariance</key>\n" +
                    "\t<real>20</real>\n" +
                    "\t<key>startColorAlpha</key>\n" +
                    "\t<real>0.5</real>\n" +
                    "\t<key>startColorBlue</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorGreen</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>startColorRed</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorVarianceAlpha</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>startColorVarianceBlue</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>startColorVarianceGreen</key>\n" +
                    "\t<real>0.30000001192092896</real>\n" +
                    "\t<key>startColorVarianceRed</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>startParticleSize</key>\n" +
                    "\t<real>6</real>\n" +
                    "\t<key>startParticleSizeVariance</key>\n" +
                    "\t<real>2</real>\n" +
                    "\t<key>tangentialAccelVariance</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>tangentialAcceleration</key>\n" +
                    "\t<real>0.0</real>\n" +
                    "\t<key>textureFileName</key>\n" +
                    "\t<string>"+particleShape+"</string>\n" +
                    "</dict>\n" +
                    "</plist>\n");
            editP4Config.close();

            FileWriter editP8Config = new FileWriter(filePath + "portalEffect08.plist");
            editP8Config.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<!DOCTYPE plist PUBLIC \"-//Apple//DTD PLIST 1.0//EN\" \"http://www.apple.com/DTDs/PropertyList-1.0.dtd\">\n" +
                    "<plist version=\"1.0\">\n" +
                    "<dict>\n" +
                    "\t<key>angle</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>angleVariance</key>\n" +
                    "\t<real>360</real>\n" +
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
                    "\t<real>"+portalNum+"</real>\n" +
                    "\t<key>maxRadius</key>\n" +
                    "\t<real>100</real>\n" +
                    "\t<key>maxRadiusVariance</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>minRadius</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>particleLifespan</key>\n" +
                    "\t<real>0.5</real>\n" +
                    "\t<key>particleLifespanVariance</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>radialAccelVariance</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>radialAcceleration</key>\n" +
                    "\t<real>-114.206413269043</real>\n" +
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
                    "\t<real>0</real>\n" +
                    "\t<key>sourcePositionVariancey</key>\n" +
                    "\t<real>10</real>\n" +
                    "\t<key>sourcePositionx</key>\n" +
                    "\t<real>186.4189147949219</real>\n" +
                    "\t<key>sourcePositiony</key>\n" +
                    "\t<real>179.7543640136719</real>\n" +
                    "\t<key>speed</key>\n" +
                    "\t<real>50</real>\n" +
                    "\t<key>speedVariance</key>\n" +
                    "\t<real>10</real>\n" +
                    "\t<key>startColorAlpha</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorBlue</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>startColorGreen</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorRed</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>startColorVarianceAlpha</key>\n" +
                    "\t<real>0.5</real>\n" +
                    "\t<key>startColorVarianceBlue</key>\n" +
                    "\t<real>0.25</real>\n" +
                    "\t<key>startColorVarianceGreen</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>startColorVarianceRed</key>\n" +
                    "\t<real>0.25</real>\n" +
                    "\t<key>startParticleSize</key>\n" +
                    "\t<real>7</real>\n" +
                    "\t<key>startParticleSizeVariance</key>\n" +
                    "\t<real>2</real>\n" +
                    "\t<key>tangentialAccelVariance</key>\n" +
                    "\t<real>100</real>\n" +
                    "\t<key>tangentialAcceleration</key>\n" +
                    "\t<real>-100</real>\n" +
                    "\t<key>textureFileName</key>\n" +
                    "\t<string>"+particleShape+"</string>\n" +
                    "</dict>\n" +
                    "</plist>\n");
            editP8Config.close();

            FileWriter editP9Config = new FileWriter(filePath + "portalEffect09.plist");
            editP9Config.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<!DOCTYPE plist PUBLIC \"-//Apple//DTD PLIST 1.0//EN\" \"http://www.apple.com/DTDs/PropertyList-1.0.dtd\">\n" +
                    "<plist version=\"1.0\">\n" +
                    "<dict>\n" +
                    "\t<key>angle</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>angleVariance</key>\n" +
                    "\t<real>360</real>\n" +
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
                    "\t<real>"+portalNum+"</real>\n" +
                    "\t<key>maxRadius</key>\n" +
                    "\t<real>100</real>\n" +
                    "\t<key>maxRadiusVariance</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>minRadius</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>particleLifespan</key>\n" +
                    "\t<real>0.5</real>\n" +
                    "\t<key>particleLifespanVariance</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>radialAccelVariance</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>radialAcceleration</key>\n" +
                    "\t<real>-114.206413269043</real>\n" +
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
                    "\t<real>0</real>\n" +
                    "\t<key>sourcePositionVariancey</key>\n" +
                    "\t<real>10</real>\n" +
                    "\t<key>sourcePositionx</key>\n" +
                    "\t<real>294.7522583007812</real>\n" +
                    "\t<key>sourcePositiony</key>\n" +
                    "\t<real>135.6768493652344</real>\n" +
                    "\t<key>speed</key>\n" +
                    "\t<real>50</real>\n" +
                    "\t<key>speedVariance</key>\n" +
                    "\t<real>10</real>\n" +
                    "\t<key>startColorAlpha</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorBlue</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorGreen</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>startColorRed</key>\n" +
                    "\t<real>1</real>\n" +
                    "\t<key>startColorVarianceAlpha</key>\n" +
                    "\t<real>0.5</real>\n" +
                    "\t<key>startColorVarianceBlue</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>startColorVarianceGreen</key>\n" +
                    "\t<real>0.5</real>\n" +
                    "\t<key>startColorVarianceRed</key>\n" +
                    "\t<real>0</real>\n" +
                    "\t<key>startParticleSize</key>\n" +
                    "\t<real>7</real>\n" +
                    "\t<key>startParticleSizeVariance</key>\n" +
                    "\t<real>2</real>\n" +
                    "\t<key>tangentialAccelVariance</key>\n" +
                    "\t<real>100</real>\n" +
                    "\t<key>tangentialAcceleration</key>\n" +
                    "\t<real>-100</real>\n" +
                    "\t<key>textureFileName</key>\n" +
                    "\t<string>"+particleShape+"</string>\n" +
                    "</dict>\n" +
                    "</plist>\n");
            editP9Config.close();

            System.out.println("portal particle config set at " + portalNum);
        } catch (IOException e) {
            System.out.println("issue setting portal particles config :(");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        gdppeUI.run();

        // console based version, only used for testing

        //String dragFilePath = "D:\\Steam\\steamapps\\common\\Geometry Dash\\Resources\\dragEffect.plist"; //default 30
        String dragFilePath = "C:\\Program Files (x86)\\Steam\\steamapps\\common\\Geometry Dash\\Resources\\dragEffect.plist";
        String landFilePath = "D:\\Steam\\steamapps\\common\\Geometry Dash\\Resources\\landEffect.plist"; //default 10
        String shipFilePath = "D:\\Steam\\steamapps\\common\\Geometry Dash\\Resources\\shipDragEffect.plist"; //default 40
        String swingFilePath = "D:\\Steam\\steamapps\\common\\Geometry Dash\\Resources\\swingBurstEffect.plist"; //default 10
        String burstFilePath = "D:\\Steam\\steamapps\\common\\Geometry Dash\\Resources\\burstEffect.plist"; //default 50
        String robotFilePath = "D:\\Steam\\steamapps\\common\\Geometry Dash\\Resources\\burstEffect2.plist"; //default 50
        String orbFilePath = "D:\\Steam\\steamapps\\common\\Geometry Dash\\Resources\\ringEffect.plist"; //default 30

        int dragParticles = 30;
        int landParticles = 10;
        int shipParticles = 40;
        int swingParticles = 10;
        int burstParticles = 50;
        int robotParticles = 50;
        int orbParticles = 30;

        System.out.println("Please enter drag particle amount (0 to turn off, default is 30, 1000+ may affect performance)");
        Scanner dragInput = new Scanner(System.in);
        dragParticles = dragInput.nextInt();
        System.out.println("Please enter the shape of particle you want (circle or square (default))"); // temporary shape editor before adding to ui
        Scanner shapeInput = new Scanner(System.in);
        String particleShape = shapeInput.nextLine().toLowerCase();
        System.out.println(particleShape);
        dragConfig(dragParticles, dragFilePath, particleShape);
        System.out.println(dragParticles);
//
//        System.out.println("Please enter land particle amount (0 to turn off, default is 10, 1000+ may affect performance)");
//        Scanner landInput = new Scanner(System.in);
//        landParticles = landInput.nextInt();
//        landConfig(landParticles, landFilePath);
//        System.out.println(landParticles);
//
//        System.out.println("Please enter ship particle amount (0 to turn off, default is 40, 1000+ may affect performance)");
//        Scanner shipInput = new Scanner(System.in);
//        shipParticles = shipInput.nextInt();
//        shipConfig(shipParticles, shipFilePath);
//        System.out.println(shipParticles);
//
//        System.out.println("Please enter swing particle amount (0 to turn off, default is 10, 1000+ may affect performance)");
//        Scanner swingInput = new Scanner(System.in);
//        swingParticles = swingInput.nextInt();
//        swingConfig(swingParticles, swingFilePath);
//        System.out.println(swingParticles);
//
//        System.out.println("Please enter ufo burst particle amount (0 to turn off, default is 50, 1000+ may affect performance)");
//        Scanner burstInput = new Scanner(System.in);
//        burstParticles = burstInput.nextInt();
//        burstConfig(burstParticles, burstFilePath);
//        System.out.println(burstParticles);
//
//        System.out.println("Please enter robot burst particle amount (0 to turn off, default is 50, 1000+ may affect performance)");
//        Scanner robotInput = new Scanner(System.in);
//        robotParticles = robotInput.nextInt();
//        robotConfig(robotParticles, robotFilePath);
//        System.out.println(robotParticles);
//
//        System.out.println("Please enter orb particle amount (0 to turn off, default is 30, 1000+ may affect performance)");
//        Scanner orbInput = new Scanner(System.in);
//        orbParticles = orbInput.nextInt();
//        orbConfig(orbParticles, orbFilePath);
//        System.out.println(orbParticles);


        try {                               // prints the contents of the dragEffect file to the terminal
            File ppFile = new File(dragFilePath);
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