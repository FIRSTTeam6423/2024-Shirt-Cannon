// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.wmironpatriots.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

import org.wmironpatriots.robot.Util.CommandController;
import org.wmironpatriots.robot.subsystems.drive.Drive;

public class DriveJoystick {
  private final Drive drive;
  private final CommandController controller;

  public DriveJoystick(Drive drive, CommandController controller) {
    this.drive = drive;
    this.controller = controller;
  }
  
  public Command driveRobot() {
    return Commands.run(
      () -> {
        drive.setMotorSpeed(
          controller.getJoystickAxis(XboxController.Axis.kLeftY.value), 
          controller.getJoystickAxis(XboxController.Axis.kRightY.value)
        );
      }
    );
  }
}
