package com.base.engine;

//import static Store.Tex.*;

/**
 * Populates the overworld with tiles
 */

public class TileGrid {

    /**
     * Creates a basic map matrix
     */
    public Tile[][] map;
    /**
     * constructor Loop that populates the world with Grass type tiles
     */
    public TileGrid() {
        map= new Tile[20][15];
        for (int i=0; i <map.length; i++) {
            for (int j=0; j<map[i].length;j++) {
                map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Grass);
            }
        }
    }

    /**
     * Loop to populate the world with Grass and Brick type tiles
     */
    public TileGrid(final int[][] newMap) {
        map = new Tile[20][15];
        for (int i=0; i < map.length; i++) {
            for (int j=0; j < map[i].length;j++) {
                switch (newMap[j][i]) {
                    case 0:
                        map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Grass);
                        break;
                    case 1:
                        map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Bricks);
                        break;
                }
            }
        }
    }
    /**
     * Loop that assigns textures to tiles based on their type
     */
    public void draw() {
        for (int i=0; i < map.length; i++) {
            for (int j=0; j < map[i].length;j++) {
                final Tile tile = map[i][j];
                Store.drawQuadTex(tile.getTexture(),tile.getX(),tile.getY(),tile.getWidth(),tile.getHeight());
            }
        }
    }
}