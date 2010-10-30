/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2007-2010, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */


package scala.swing.group

/** Provides constants to specify the resizing beheviour of groups in a 
  * `GroupPanel`.
  * 
  * @author Andreas Flierl
  */
trait Resizing {
  /** 
   * Allows to specify whether a parallel group should be resizable or of
   * fixed size.
   */
  protected sealed class Resizability(private[group] val wrapped: Boolean)

  /** The corresponding parallel group should be resizable. */
  object Resizable extends Resizability(true)
  
  /** The corresponding parallel group should be of fixed size. */
  object FixedSize extends Resizability(false)
}