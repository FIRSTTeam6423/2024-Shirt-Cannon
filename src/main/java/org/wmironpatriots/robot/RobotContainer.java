// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.wmironpatriots.robot;

import org.wmironpatriots.robot.Constants.ControllerConstantsK;
import org.wmironpatriots.robot.Util.CommandController;
import org.wmironpatriots.robot.commands.DriveJoystick;
import org.wmironpatriots.robot.subsystems.drive.Drive;

public class RobotContainer {
  // * ------ SUBSYSTEMS ------
  private final Drive drive;

  // * ------ COMMAND GROUPS ------
  private final DriveJoystick driveJoystick;

  // * ------ AUTO (womp womp) ------

  // * ------ CONTROLLERS ------
  private final CommandController driveController;
  
  public RobotContainer() {
    // * init subsystems here
    drive = new Drive();

    driveController = new CommandController(
      ControllerConstantsK.kDriveControllerPort, 
      ControllerConstantsK.kDriveControllerJoystickDeadband, 
      ControllerConstantsK.kDrivecontrollerTriggerDeadband
    );

    driveJoystick = new DriveJoystick(drive, driveController);

    configureDefaultCommands();
    configureBindings();
  }

  public void configureDefaultCommands() {

    drive.setDefaultCommand(
      driveJoystick.driveRobot()
    );

  }

  private void configureBindings() {
    // ---- TRIGGERS ----


    // ---- DRIVER BINDS ----
    // * Left Trigger Axis is used for slow mode

    // ---- OPERATOR BINDS ----
  }
}
