package frc.robot.Sim_Components;

import org.littletonrobotics.junction.Logger;

//import com.team2383.robot.subsystems.pivot.PivotSubsystem;

import edu.wpi.first.math.geometry.Pose3d;
import edu.wpi.first.math.geometry.Rotation3d;
import edu.wpi.first.math.geometry.Transform3d;
import edu.wpi.first.math.geometry.Translation3d;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SimComponents extends SubsystemBase {
   /* 
    private final PivotSubsystem pivot;

    public SimComponents(PivotSubsystem pivot) {
        this.pivot = pivot;
    }

    @Override
    public void periodic() {
        Logger.recordOutput("Components", getComponents(-pivot.getAngle().getRadians()));
        Logger.recordOutput("DesiredComponents", getComponents(-pivot.getDesiredAngle().getRadians()));
    }

    Pose3d[] getComponents(double pivotAngleRad) {
        Pose3d[] pose = new Pose3d[2];

        Pose3d robotPose = new Pose3d(new Translation3d(0.0, 0.0, 0.0), new Rotation3d());
        Rotation3d pivotRotation = new Rotation3d(0, -pivot.getAngle().getRadians(), 0);

        Transform3d pivotPose = new Transform3d(new Translation3d(0, 0, 0.5679186), pivotRotation);
        pose[0] = robotPose;
        pose[1] = robotPose.transformBy(pivotPose);

        return pose;
    }
    */
}