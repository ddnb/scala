package com.lehungio.classes

class TwoFer {

  def twofer(inputName: String = null): String = {
    val name = Option(inputName).getOrElse("you")
    s"One for $name, one for me."
  }
}
