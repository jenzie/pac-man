Pac-Man
=======

Implementation of the classic Pac-Man game in Java.

Gameplay
--------

The player controls Pac-Man through a maze, eating pac-dots or pellets. When all pac-dots are eaten, Pac-Man is taken to the next stage. Between some stages one of three intermission animations plays. Four enemies (Blinky, Pinky, Inky and Clyde) roam the maze, trying to catch Pac-Man. If an enemy touches Pac-Man, a life is lost. When all lives have been lost, the game ends. Pac-Man is awarded a single bonus life at 10,000 points by default—DIP switches inside the machine can change the required points or disable the bonus life altogether. Near the corners of the maze are four larger, flashing dots known as power pellets that provide Pac-Man with the temporary ability to eat the enemies. The enemies turn deep blue, reverse direction and usually move more slowly. When an enemy is eaten, its eyes remain and return to the center box where it is regenerated in its normal color. Blue enemies flash white to signal that they are about to become dangerous again and the length of time for which the enemies remain vulnerable varies from one stage to the next, generally becoming shorter as the game progresses. In later stages, the enemies go straight to flashing, bypassing blue, which means that they can only be eaten for a short amount of time, although they still reverse direction when a power pellet is eaten; in even later stages, the ghosts do not become edible (i.e., they do not change color and still make Pacman lose a life on contact), but they still reverse direction.

Enemies
-------

The enemies in Pac-Man are known variously as "ghosts," "goblins," "octopi" and "monsters". Despite the seemingly random nature of the enemies, their movements are strictly deterministic, which players have used to their advantage. In an interview, creator Toru Iwatani stated that he had designed each enemy with its own distinct personality in order to keep the game from becoming impossibly difficult or boring to play. More recently, Iwatani described the enemy behaviors in more detail at the 2011 Game Developers Conference. He stated that the red enemy chases Pac-Man, and the pink and blue enemies try to position themselves in front of Pac-Man's mouth. Although he claimed that the orange enemy's behavior is random, a careful analysis of the game's code reveals that it actually chases Pac-Man most of the time, but also moves toward the lower-left corner of the maze when it gets too close to Pac-Man.

Sources
-------

Descriptions for Gameplay and Enemies from:  
http://en.wikipedia.org/w/index.php?title=Pac-Man&oldid=539262353
