#ifndef KONAN_LIBKPARSER_H
#define KONAN_LIBKPARSER_H
#ifdef __cplusplus
extern "C" {
#endif
#ifdef __cplusplus
typedef bool            libkparser_KBoolean;
#else
typedef _Bool           libkparser_KBoolean;
#endif
typedef unsigned short     libkparser_KChar;
typedef signed char        libkparser_KByte;
typedef short              libkparser_KShort;
typedef int                libkparser_KInt;
typedef long long          libkparser_KLong;
typedef unsigned char      libkparser_KUByte;
typedef unsigned short     libkparser_KUShort;
typedef unsigned int       libkparser_KUInt;
typedef unsigned long long libkparser_KULong;
typedef float              libkparser_KFloat;
typedef double             libkparser_KDouble;
typedef void*              libkparser_KNativePtr;
struct libkparser_KType;
typedef struct libkparser_KType libkparser_KType;

typedef struct {
  libkparser_KNativePtr pinned;
} libkparser_kref_io_thelimitbreaker_kparser_ExpressionParser;


typedef struct {
  /* Service functions. */
  void (*DisposeStablePointer)(libkparser_KNativePtr ptr);
  void (*DisposeString)(const char* string);
  libkparser_KBoolean (*IsInstance)(libkparser_KNativePtr ref, const libkparser_KType* type);

  /* User functions. */
  struct {
    struct {
      struct {
        struct {
          struct {
            struct {
              libkparser_KType* (*_type)(void);
              libkparser_kref_io_thelimitbreaker_kparser_ExpressionParser (*ExpressionParser)();
              libkparser_KDouble (*evaluateExpression)(libkparser_kref_io_thelimitbreaker_kparser_ExpressionParser thiz, const char* expression, libkparser_KInt precision);
            } ExpressionParser;
          } kparser;
        } thelimitbreaker;
      } io;
    } root;
  } kotlin;
} libkparser_ExportedSymbols;
extern libkparser_ExportedSymbols* libkparser_symbols(void);
#ifdef __cplusplus
}  /* extern "C" */
#endif
#endif  /* KONAN_LIBKPARSER_H */
