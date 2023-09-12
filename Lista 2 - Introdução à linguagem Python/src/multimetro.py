from math import sqrt


def main() -> None:
    total: float = 0
    measurement: list = []

    for i in range(10):
        read: float = float(input(f"Measurement {i}: "))

        measurement.append(read)
        total += read

    average: float = total / len(measurement)

    variance: float = 0
    for v in measurement:
        variance += (v - average) ** 2
    variance /= len(measurement)

    # Standard deviation
    std: float = sqrt(variance)

    print(f"Average: {average}")
    print(f"Standard deviation: {std}")

    if std > average * 0.1:
        print("The multimeter has a defect.")
    else:
        print("The multimeter is working fine.")


if __name__ == "__main__":
    main()