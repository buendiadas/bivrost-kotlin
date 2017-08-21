import java.math.BigInteger

fun main(args: Array<String>) {
    println("Hello World!")

    println(Solidity.Int8(BigInteger.valueOf(-129)).encode())
    println(Solidity.UInt8(BigInteger("255")).encode())
    println(Solidity.UInt256(BigInteger.TEN).encode())
    println(Solidity.Boolean(true).encode())
    println(Solidity.Boolean(false).encode())
}