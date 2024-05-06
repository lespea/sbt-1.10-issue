If you do a `sbt test` with sbt `1.9.9` then everything works okay.  However trying to compile the tests with `1.10.0` produces:

```
[error] value getOffsetStatic is not a member of object scala.runtime.LazyVals
[error] Bad symbolic reference. A signature in /Users/username/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.1.3/scala3-library_3-3.1.3.jar(scala/runtime/LazyVals.tasty)
[error] refers to Waiting/T in object scala.runtime.LazyVals which is not available.
[error] It may be completely missing from the current classpath, or the version on
[error] the classpath might be incompatible with the version used when compiling /Users/username/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.1.3/scala3-library_3-3.1.3.jar(scala/runtime/LazyVals.tasty).
[error] Bad symbolic reference. A signature in /Users/username/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.1.3/scala3-library_3-3.1.3.jar(scala/runtime/LazyVals.tasty)
[error] refers to LazyValControlState/T in object scala.runtime.LazyVals which is not available.
[error] It may be completely missing from the current classpath, or the version on
[error] the classpath might be incompatible with the version used when compiling /Users/username/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.1.3/scala3-library_3-3.1.3.jar(scala/runtime/LazyVals.tasty).
[error] value Evaluating is not a member of object scala.runtime.LazyVals
[error] value NullValue is not a member of object scala.runtime.LazyVals
[error] value objCAS is not a member of object scala.runtime.LazyVals
[error] value countDown is not a member of scala.runtime.LazyVals.Waiting
[error] scala.runtime.LazyVals.Waiting does not have a constructor
[error] value getOffsetStatic is not a member of object scala.runtime.LazyVals
[error] value Evaluating is not a member of object scala.runtime.LazyVals
[error] value NullValue is not a member of object scala.runtime.LazyVals
[error] value objCAS is not a member of object scala.runtime.LazyVals
[error] value countDown is not a member of scala.runtime.LazyVals.Waiting
[error] scala.runtime.LazyVals.Waiting does not have a constructor
[error] value getOffsetStatic is not a member of object scala.runtime.LazyVals
[error] value Evaluating is not a member of object scala.runtime.LazyVals
[error] value NullValue is not a member of object scala.runtime.LazyVals
[error] value objCAS is not a member of object scala.runtime.LazyVals
[error] value countDown is not a member of scala.runtime.LazyVals.Waiting
[error] scala.runtime.LazyVals.Waiting does not have a constructor
[error] value getOffsetStatic is not a member of object scala.runtime.LazyVals
[error] value Evaluating is not a member of object scala.runtime.LazyVals
[error] value NullValue is not a member of object scala.runtime.LazyVals
[error] value objCAS is not a member of object scala.runtime.LazyVals
[error] value countDown is not a member of scala.runtime.LazyVals.Waiting
[error] scala.runtime.LazyVals.Waiting does not have a constructor
[error] 26 errors found
[error] (Test / compileIncremental) Compilation failed
[error] Total time: 4 s, completed May 6, 2024, 12:04:01 PM
```

Everything seems to work okay if `autoScalaLibrary := false` is not set to false.
