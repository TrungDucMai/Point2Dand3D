package com.company;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public  Point3D(){}
    public void setXYZ( float x, float y, float z){
        getX();
        getY();
        this.z =z;
    }
    public float[] getXYZ (){
       float Array[]={getX(),getY(),z};
        return Array;
    }

    @Override
    public String toString() {
        return "Point3D{" + "x="+ getX()+" y="+getY()
                +"z=" + z +
                '}';
    }
}
