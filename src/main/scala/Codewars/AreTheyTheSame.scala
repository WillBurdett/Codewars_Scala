package Codewars

// Given two arrays a and b write a function comp(a, b) that checks whether the two arrays have the
// "same" elements, with the same multiplicities (the multiplicity of a member is the number of times it appears).
// "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.

object AreTheyTheSame extends App {
  def comp(seq1: Seq[Int], seq2: Seq[Int]): Boolean = {
    if (seq1 == null || seq2 == null) return false
    if (seq2.sorted == seq1.map(el => el*el).sorted) true else false
  }

  val seq1 = Seq(121, 144, 19, 161, 19, 144, 19, 11)
  val seq2 = Seq(11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19)

  println(comp(seq1, seq2))
}
