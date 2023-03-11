package trainingClassesAndObjects

/**
 * Тренировка особенность классов, модификаторов доступа и вложенных классов, интерфейсы и реализация в котлин
 */

private val x = 10
//public val y = 10
internal val z = 12
   fun main(){
      val test1 = Music().Band().classicMusic(234)
      val google = Google()
      google.run()
      google.stop()


      /**
       * Тренировка наследование от класса в Kotlin
       */

      val xiaomiPhone = AndroidClass("Android","mi8",222)
      val samsungPhone = AndroidClass("Android","s35 ultra",224)
      val iPhone11  = IOS ("IPhone11", 500)

      println(xiaomiPhone.printInfo())
      println(xiaomiPhone.isExpensiveMore300())
      println(samsungPhone.printInfo())
      println(samsungPhone.isExpensiveMore300())
      println(iPhone11.printInfo())
      println(iPhone11.isExpensiveMore300())

      /**
       * Тренировка использования дата классов, деструктор, перечисления в Kotlin
       */

      val ivan = Student("Ivan",90,7)
      val petr = ivan.copy("Petr", 98)
      println(ivan)
      println(petr)

      val david = Human("David Bowie", 71, false)

      val human = david.component1()
      val age = david.component1()
      val isAlive = david.component1()

      println(human)
      println(age)
      println(isAlive)

      val classic: MusicEnum = MusicEnum.CLASSIC;
      println(classic.band)
      println(MusicEnum.ROCK.band)
      val metal: MusicEnum = MusicEnum.METAL
      println(metal.name)
      println(metal.ordinal)
      for (printAll in MusicEnum.values())
            println(printAll)
      println(MusicEnum.valueOf("METAL"))
   }
