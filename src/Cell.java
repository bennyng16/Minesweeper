/***
 * Cell class holds information for each individual cell, including whether or
 * not that cell is a mine, how many mines are around it, and its flag value if
 * one has been set by the player.
 * 
 * 
 * @author Benny
 *
 */
public class Cell 
{

  String cellType = "NONE";
  String flagType = "NONE";
  int numAdjacentMines = -1;

  public String getCellType()
  {
    return cellType;
  }

  // REQ: cellType equals NONE | MINE
  public void setCellType(String cellType)
  {
    if(cellType.equals("NONE") || cellType.equals("MINE"))
      this.cellType = cellType;
  }

  public String getFlagType()
  {
    return flagType;
  }

  //
  public void setFlagType(String flagType)
  {
    if(flagType.equals("NONE") || flagType.equals("UNKNOWN") || flagType.equals("MINE"))
      this.flagType = flagType;
  }

  public int getNumAdjacentMines()
  {
    return numAdjacentMines;
  }

  public void setNumAdjacentMines(int numAdjacentMines)
  {
    this.numAdjacentMines = numAdjacentMines;
  }
  
  public String toString()
  {
    return "CellType: " + cellType + " String: " 
        + flagType + " numAdjines: " + numAdjacentMines;
  }

}