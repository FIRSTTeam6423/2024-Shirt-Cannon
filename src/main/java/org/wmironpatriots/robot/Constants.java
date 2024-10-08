// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.wmironpatriots.robot;

// * constants should be imported like this
// ? import static frc.robot.Constants.SubsytemConstants.*;
// ! some of these values will need to be tuned again
public class Constants {

    public static final class ControllerConstantsK {

        public static final int kDriveControllerPort = 0;
        public static final double kDriveControllerJoystickDeadband = 0.2;
        public static final double kDrivecontrollerTriggerDeadband = 0.2;

    }

    public static final class DriveConstantsK {
        
        // * Motor IDs
        public static final int[] kdriveLeftMotorIDs = {0, 1, 2};
        public static final int[] kdriveRightMotorIDs = {3, 4, 5};
    
    }
    
}
