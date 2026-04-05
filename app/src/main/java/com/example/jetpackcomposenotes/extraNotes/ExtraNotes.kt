package com.example.jetpackcomposenotes.extraNotes
/*
---------- SP (scale-independent pixels) ----------

Example:
fontSize = 30.sp

What is 30.sp?

- Not a normal integer
- It is a Kotlin extension property

Internally behaves like:
TextUnit(30f, TextUnitType.Sp)

Why not seen in Java?
- Java does NOT support extension functions/properties
- Kotlin allows adding properties like .sp to Int

Example internally:
val Int.sp: TextUnit
    get() = TextUnit(this.toFloat(), TextUnitType.Sp)

Meaning:
30.sp → converts Int to TextUnit

---------- dp vs sp ----------

dp → Used for layout (padding, size, margin)
sp → Used for text (respects user font settings)

sp scales with:
- screen density
- user accessibility font size

---------- IMPORTANT RULES ----------

- Always use sp for text (never dp)
- textAlign works only if width is constrained (use fillMaxWidth)
- Use maxLines + overflow in lists to avoid UI break
- Avoid hardcoding in reusable components
- Keep composables simple to avoid heavy recomposition
*/




