package com.pixelPower.game;

import org.lwjgl.util.vector.Vector2f;

public class BlockHelper {
    public static final float div = 1.0f / 16.0f;

    public static enum SIDE {
        LEFT, RIGHT, TOP, BOTTOM, FRONT, BACK;
    };

    static Vector2f calcOffsetForTextureAt(int x, int y) {
        return new Vector2f(x * div, y * div);
    }

    public static Vector2f getTextureOffsetFor(int type, SIDE side) {
        switch (type) {
            case 0x1:
                if (side == SIDE.LEFT || side == SIDE.RIGHT || side == SIDE.FRONT || side == SIDE.BACK) {
                    return calcOffsetForTextureAt(3, 0);
                } else if (side == SIDE.TOP) {
                    calcOffsetForTextureAt(0, 0);
                } else {
                    calcOffsetForTextureAt(2, 0);
                }
                break;
            case 0x2:
                calcOffsetForTextureAt(2, 0);
                break;
        }

        return calcOffsetForTextureAt(2, 0);
    }
}
