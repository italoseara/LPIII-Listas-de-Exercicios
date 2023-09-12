from typing import NewType


Board = NewType("Board", list[list[str]])

class Piece:
    BLANK  = '-'
    PLAYER = '@'
    MISS   = 'O'
    HIT    = 'X'


def main() -> None:
    player1: Board = new_board()
    player2: Board = new_board()
    player1_attack: Board = new_board()
    player2_attack: Board = new_board()

    print("Welcome to Battleship!!!")

    print("\nPLAYER 1, ENTER YOUR SHIPS' COORDINATES.")
    get_ship_coords(player1)
    print_board(player1)

    print("\nPLAYER 2, ENTER YOUR SHIPS' COORDINATES.")
    get_ship_coords(player2)
    print_board(player2)

    turn: int = 1
    while True:
        if turn == 1:
            get_attack_coords(player1_attack, player2, 1)
            turn = 2
        else:
            get_attack_coords(player2_attack, player1, 2)

        winner: int = check_winner(player1, player2)

        if winner != 0:
            print(f"PLAYER {winner} WINS! YOU SUNK ALL OF YOUR OPPONENT'S SHIPS!")
            break

    print("\nFinal boards:")
    print_board(player1)
    print_board(player2)


def check_winner(board1: Board, board2: Board) -> int:
    board1_pieces: int = 0
    for row in board1:
        board1_pieces += row.count(Piece.PLAYER)
    if board1_pieces == 0: return 2

    board2_pieces: int = 0
    for row in board2:
        board2_pieces += row.count(Piece.PLAYER)
    if board2_pieces == 0: return 1

    return 0


def new_board() -> Board:
    board: Board = [[] for _ in range(5)] # 5x5 matrix

    for row in board:
        for _ in range(5):
            row.append(Piece.BLANK)

    return board


def print_board(board: Board) -> None:
    print("  0  1  2  3  4")
    for i, row in enumerate(board):
        print(f"{i} {'  '.join(row)}")


def get_ship_coords(board: Board) -> None:
    for i in range(5):
        print(f"Enter ship {i} location:")

        while True:
            x, y = map(int, input().split())
        
            if x < 0 or x >= 5 or y < 0 or y >= 5:
                print("Invalid coordinates. Choose different coordinates.")
                continue

            if board[x][y] != Piece.BLANK:
                print("You already have a ship there. Choose different coordinates.")
                continue

            break

        board[x][y] = Piece.PLAYER


def get_attack_coords(attackingBoard: Board, enemyBoard: Board, attacker: int) -> None:
    print(f"\nPlayer {attacker}, enter hit row/column:")

    while True:
        x, y = map(int, input().split())

        if x < 0 or x >= 5 or y < 0 or y >= 5:
            print("Invalid coordinates. Choose different coordinates.")
            continue

        if attackingBoard[x][y] != Piece.BLANK:
            print("You already fired on this spot. Choose different coordinates.")
            continue

        break

    if enemyBoard[x][y] == Piece.PLAYER:
        attackingBoard[x][y] = Piece.HIT
        enemyBoard[x][y] = Piece.HIT
        print(f"PLAYER {attacker} HIT PLAYER {2 if attacker == 1 else 1}'s SHIP!")
    else:
        attackingBoard[x][y] = Piece.MISS
        enemyBoard[x][y] = Piece.MISS
        print(f"PLAYER {attacker} MISSED!")
    print_board(attackingBoard)



if __name__ == "__main__":
    main()