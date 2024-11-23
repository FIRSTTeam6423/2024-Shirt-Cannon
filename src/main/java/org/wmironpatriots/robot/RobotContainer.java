// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.wmironpatriots.robot;

import org.wmironpatriots.robot.Constants.ControllerConstantsK;
import org.wmironpatriots.robot.subsystems.drive.Drive;
import org.wmironpatriots.robot.util.CommandController;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Commands;

public class RobotContainer {
  // * ------ SUBSYSTEMS ------
  private final Drive drive = new Drive();

  // * ------ COMMAND GROUPS ------

  // * ------ AUTO (womp womp) ------

  // * ------ CONTROLLERS ------
  public static CommandController driverController = new CommandController(
    0, 
    ControllerConstantsK.kDriveControllerJoystickDeadband, 
    ControllerConstantsK.kDrivecontrollerTriggerDeadband
  );
  public static CommandController operatorController = new CommandController(
    1, 
    ControllerConstantsK.kDriveControllerJoystickDeadband, 
    ControllerConstantsK.kDrivecontrollerTriggerDeadband
  );
  
  public RobotContainer() {
    //* init subsystems here
    if (Robot.isReal()) {} else {}

    configureDefaultCommands();
    configureBindings();
  }

  public void configureDefaultCommands() {

    drive.setDefaultCommand(
      Commands.run(
        () -> {
          drive.setMotorSpeed(
            driverController.getJoystickAxis(XboxController.Axis.kLeftY.value), 
            driverController.getJoystickAxis(XboxController.Axis.kRightY.value)
          );
        },
        drive
      )
    );

  }

  private void configureBindings() {
    // ---- TRIGGERS ----

    // ---- DRIVER BINDS ----
    // * Left Trigger Axis is used for slow mode

    // ---- OPERATOR BINDS ----
  }
}
