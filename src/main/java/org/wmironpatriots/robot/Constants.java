// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.wmironpatriots.robot;

import static edu.wpi.first.units.Units.Degrees;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.units.Angle;
import edu.wpi.first.units.Measure;

// * constants should be imported like this
// ? import static frc.robot.Constants.SubsytemConstants.*;
// ! some of these values will need to be tuned again
public class Constants {

    public class ControllerConstantsK {

        public static final int kDriveControllerPort = 0;
        public static final double kDriveControllerJoystickDeadband = 0.2;
        public static final double kDrivecontrollerTriggerDeadband = 0.2;

    }

    public class DriveConstantsK {
        
        // * Motor IDs
        public static final int[] kdriveLeftMotorIDs = {0, 1, 2};
        public static final int[] kdriveRightMotorIDs = {3, 4, 5};
    
    }
    
}
