if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'KParser'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'KParser'.");
}
var KParser = function (_, Kotlin) {
  'use strict';
  var Enum = Kotlin.kotlin.Enum;
  var toBoxedChar = Kotlin.toBoxedChar;
  var Kind_CLASS = Kotlin.Kind.CLASS;
  var throwISE = Kotlin.throwISE;
  var listOf = Kotlin.kotlin.collections.listOf_i5x0yv$;
  var toDoubleOrNull = Kotlin.kotlin.text.toDoubleOrNull_pdl1vz$;
  var get_indices = Kotlin.kotlin.text.get_indices_gw00vp$;
  var contains = Kotlin.kotlin.text.contains_sgbm27$;
  var unboxChar = Kotlin.unboxChar;
  var ArithmeticException = Kotlin.kotlin.ArithmeticException;
  var numberToInt = Kotlin.numberToInt;
  var round = Kotlin.kotlin.math.round_14dthe$;
  var indexOf = Kotlin.kotlin.text.indexOf_8eortd$;
  var last = Kotlin.kotlin.text.last_gw00vp$;
  var get_lastIndex = Kotlin.kotlin.text.get_lastIndex_gw00vp$;
  var startsWith = Kotlin.kotlin.text.startsWith_sgbm27$;
  var endsWith = Kotlin.kotlin.text.endsWith_sgbm27$;
  var math = Kotlin.kotlin.math;
  var equals = Kotlin.equals;
  var NumberFormatException_init = Kotlin.kotlin.NumberFormatException_init;
  var iterator = Kotlin.kotlin.text.iterator_gw00vp$;
  var Math_0 = Math;
  var throwCCE = Kotlin.throwCCE;
  var reversed = Kotlin.kotlin.text.reversed_gw00vp$;
  ExpressionParser$Operators.prototype = Object.create(Enum.prototype);
  ExpressionParser$Operators.prototype.constructor = ExpressionParser$Operators;
  function ExpressionParser() {
  }
  function ExpressionParser$Operators(name, ordinal, sign) {
    Enum.call(this);
    this.sign = toBoxedChar(sign);
    this.name$ = name;
    this.ordinal$ = ordinal;
  }
  function ExpressionParser$Operators_initFields() {
    ExpressionParser$Operators_initFields = function () {
    };
    ExpressionParser$Operators$MINUS_instance = new ExpressionParser$Operators('MINUS', 0, 45);
    ExpressionParser$Operators$PLUS_instance = new ExpressionParser$Operators('PLUS', 1, 43);
    ExpressionParser$Operators$MULTIPLY_instance = new ExpressionParser$Operators('MULTIPLY', 2, 42);
    ExpressionParser$Operators$DIVISION_instance = new ExpressionParser$Operators('DIVISION', 3, 47);
    ExpressionParser$Operators$POWER_instance = new ExpressionParser$Operators('POWER', 4, 94);
    ExpressionParser$Operators$EXPONENTIAL_instance = new ExpressionParser$Operators('EXPONENTIAL', 5, 69);
  }
  var ExpressionParser$Operators$MINUS_instance;
  function ExpressionParser$Operators$MINUS_getInstance() {
    ExpressionParser$Operators_initFields();
    return ExpressionParser$Operators$MINUS_instance;
  }
  var ExpressionParser$Operators$PLUS_instance;
  function ExpressionParser$Operators$PLUS_getInstance() {
    ExpressionParser$Operators_initFields();
    return ExpressionParser$Operators$PLUS_instance;
  }
  var ExpressionParser$Operators$MULTIPLY_instance;
  function ExpressionParser$Operators$MULTIPLY_getInstance() {
    ExpressionParser$Operators_initFields();
    return ExpressionParser$Operators$MULTIPLY_instance;
  }
  var ExpressionParser$Operators$DIVISION_instance;
  function ExpressionParser$Operators$DIVISION_getInstance() {
    ExpressionParser$Operators_initFields();
    return ExpressionParser$Operators$DIVISION_instance;
  }
  var ExpressionParser$Operators$POWER_instance;
  function ExpressionParser$Operators$POWER_getInstance() {
    ExpressionParser$Operators_initFields();
    return ExpressionParser$Operators$POWER_instance;
  }
  var ExpressionParser$Operators$EXPONENTIAL_instance;
  function ExpressionParser$Operators$EXPONENTIAL_getInstance() {
    ExpressionParser$Operators_initFields();
    return ExpressionParser$Operators$EXPONENTIAL_instance;
  }
  ExpressionParser$Operators.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Operators',
    interfaces: [Enum]
  };
  function ExpressionParser$Operators$values() {
    return [ExpressionParser$Operators$MINUS_getInstance(), ExpressionParser$Operators$PLUS_getInstance(), ExpressionParser$Operators$MULTIPLY_getInstance(), ExpressionParser$Operators$DIVISION_getInstance(), ExpressionParser$Operators$POWER_getInstance(), ExpressionParser$Operators$EXPONENTIAL_getInstance()];
  }
  ExpressionParser$Operators.values = ExpressionParser$Operators$values;
  function ExpressionParser$Operators$valueOf(name) {
    switch (name) {
      case 'MINUS':
        return ExpressionParser$Operators$MINUS_getInstance();
      case 'PLUS':
        return ExpressionParser$Operators$PLUS_getInstance();
      case 'MULTIPLY':
        return ExpressionParser$Operators$MULTIPLY_getInstance();
      case 'DIVISION':
        return ExpressionParser$Operators$DIVISION_getInstance();
      case 'POWER':
        return ExpressionParser$Operators$POWER_getInstance();
      case 'EXPONENTIAL':
        return ExpressionParser$Operators$EXPONENTIAL_getInstance();
      default:throwISE('No enum constant io.thelimitbreaker.kparser.ExpressionParser.Operators.' + name);
    }
  }
  ExpressionParser$Operators.valueOf_61zpoe$ = ExpressionParser$Operators$valueOf;
  ExpressionParser.prototype.split_0 = function ($receiver, position) {
    var tmp$ = $receiver.substring(0, position);
    var startIndex = position + 1 | 0;
    var endIndex = $receiver.length;
    return listOf([tmp$, $receiver.substring(startIndex, endIndex)]);
  };
  ExpressionParser.prototype.extractNumber_0 = function (numString) {
    return toDoubleOrNull(numString);
  };
  ExpressionParser.prototype.isValue_0 = function (expression) {
    var tmp$, tmp$_0, tmp$_1, tmp$_2;
    var validChars = '1234567890.-';
    tmp$ = get_indices(expression);
    tmp$_0 = tmp$.first;
    tmp$_1 = tmp$.last;
    tmp$_2 = tmp$.step;
    for (var i = tmp$_0; i <= tmp$_1; i += tmp$_2) {
      var char = expression.charCodeAt(i);
      if (!contains(validChars, char))
        return false;
      var tmp$_3;
      var count = 0;
      tmp$_3 = iterator(expression);
      while (tmp$_3.hasNext()) {
        var element = unboxChar(tmp$_3.next());
        if (unboxChar(toBoxedChar(element)) === 46)
          count = count + 1 | 0;
      }
      if (count > 1)
        return false;
      if (char === 45 && i !== 0)
        return false;
    }
    return true;
  };
  ExpressionParser.prototype.lastIndexOf_0 = function ($receiver, char) {
    var tmp$, tmp$_0, tmp$_1, tmp$_2;
    var bOpen = 0;
    var bClose = 0;
    tmp$ = get_indices($receiver);
    tmp$_0 = tmp$.first;
    tmp$_1 = tmp$.last;
    tmp$_2 = tmp$.step;
    for (var i = tmp$_0; i <= tmp$_1; i += tmp$_2) {
      var currChar = $receiver.charCodeAt(i);
      if (currChar === char && bOpen === bClose)
        return $receiver.length - i - 1 | 0;
      else if (currChar === 40) {
        bOpen = bOpen + 1 | 0;
      }
       else if (currChar === 41) {
        bClose = bClose + 1 | 0;
      }
    }
    return -1;
  };
  ExpressionParser.prototype.isOperator_0 = function (operator, expression, position) {
    var tmp$, tmp$_0;
    if (operator === ExpressionParser$Operators$PLUS_getInstance()) {
      if (expression.charCodeAt(position - 1 | 0) === 69) {
        if (position >= 2) {
          return false;
        }
      }
       else {
        return true;
      }
    }
     else if (operator === ExpressionParser$Operators$MINUS_getInstance()) {
      if (position === 0) {
        return false;
      }
       else if (expression.charCodeAt(position - 1 | 0) === 69 && position >= 2) {
        return false;
      }
       else {
        var prevOperator = expression.charCodeAt(position - 1 | 0);
        tmp$ = ExpressionParser$Operators$values();
        for (tmp$_0 = 0; tmp$_0 !== tmp$.length; ++tmp$_0) {
          var legalOp = tmp$[tmp$_0];
          if (prevOperator === unboxChar(legalOp.sign))
            return false;
        }
        return true;
      }
    }
    return true;
  };
  ExpressionParser.prototype.evaluateFunction_0 = function (funString, value) {
    var tmp$;
    switch (funString) {
      case 'SIN':
      case 'sin':
      case 'Sin':
        tmp$ = Math_0.sin(value);
        break;
      case 'COS':
      case 'cos':
      case 'Cos':
        tmp$ = Math_0.cos(value);
        break;
      case 'TAN':
      case 'tan':
      case 'Tan':
        tmp$ = Math_0.tan(value);
        break;
      case 'ASIN':
      case 'asin':
        tmp$ = Math_0.asin(value);
        break;
      case 'ACOS':
      case 'acos':
        tmp$ = Math_0.acos(value);
        break;
      case 'ATAN':
      case 'atan':
        tmp$ = Math_0.atan(value);
        break;
      case 'LOG10':
      case 'log10':
      case 'Log10':
        tmp$ = Math_0.log10(value);
        break;
      case 'LN':
      case 'Ln':
      case 'ln':
        tmp$ = Math_0.log(value);
        break;
      case 'SQRT':
      case 'sqrt':
      case 'Sqrt':
        tmp$ = Math_0.sqrt(value);
        break;
      case 'EXP':
      case 'exp':
      case 'Exp':
        tmp$ = Math_0.exp(value);
        break;
      case 'SINH':
      case 'sinh':
      case 'Sinh':
        tmp$ = Math_0.sinh(value);
        break;
      case 'COSH':
      case 'cosh':
      case 'Cosh':
        tmp$ = Math_0.cosh(value);
        break;
      case 'TANH':
      case 'tanh':
      case 'Tanh':
        tmp$ = Math_0.tanh(value);
        break;
      default:throw new ArithmeticException('Function cannot be determined ' + funString);
    }
    return tmp$;
  };
  ExpressionParser.prototype.roundToPrecision_0 = function (value, precision) {
    if (precision === void 0)
      precision = 3;
    var corrector = numberToInt(Math_0.pow(10.0, precision));
    return round(value * corrector) / corrector;
  };
  ExpressionParser.prototype.evaluateExpression_bm4lxs$ = function (expression, precision) {
    if (precision === void 0)
      precision = 3;
    var res = this.evaluate_0(expression);
    return this.roundToPrecision_0(res, precision);
  };
  ExpressionParser.prototype.evaluate_0 = function (expression) {
    var tmp$, tmp$_0, tmp$_1, tmp$_2, tmp$_3;
    tmp$ = ExpressionParser$Operators$values();
    for (tmp$_0 = 0; tmp$_0 !== tmp$.length; ++tmp$_0) {
      var operator = tmp$[tmp$_0];
      var tmp$_4;
      var position = this.lastIndexOf_0(reversed(Kotlin.isCharSequence(tmp$_4 = expression) ? tmp$_4 : throwCCE()).toString(), unboxChar(operator.sign));
      while (position > 0) {
        if (this.isOperator_0(operator, expression, position)) {
          var partialExpressions = this.split_0(expression, position);
          var left = partialExpressions.get_za3lpa$(0);
          var right = partialExpressions.get_za3lpa$(1);
          var value0 = this.evaluate_0(left);
          var value1 = this.evaluate_0(right);
          switch (operator.name) {
            case 'PLUS':
              tmp$_1 = value0 + value1;
              break;
            case 'MINUS':
              tmp$_1 = value0 - value1;
              break;
            case 'DIVISION':
              if (value1 === 0.0)
                throw new ArithmeticException('Divide By Zero');
              tmp$_1 = value0 / value1;
              break;
            case 'MULTIPLY':
              tmp$_1 = value0 * value1;
              break;
            case 'POWER':
              tmp$_1 = Math_0.pow(value0, value1);
              break;
            case 'EXPONENTIAL':
              tmp$_1 = value0 * Math_0.pow(10.0, value1);
              break;
            default:tmp$_1 = Kotlin.noWhenBranchMatched();
              break;
          }
          var res = tmp$_1;
          return res;
        }
        if (position > 0) {
          var endIndex = position;
          var $receiver = expression.substring(0, endIndex);
          var tmp$_5;
          position = this.lastIndexOf_0(reversed(Kotlin.isCharSequence(tmp$_5 = $receiver) ? tmp$_5 : throwCCE()).toString(), unboxChar(operator.sign));
        }
      }
    }
    var position_0 = indexOf(expression, 40);
    if (position_0 > 0 && last(expression) === 41) {
      var funString = expression.substring(0, position_0);
      var startIndex = position_0 + 1 | 0;
      var endIndex_0 = get_lastIndex(expression);
      var value = this.evaluate_0(expression.substring(startIndex, endIndex_0));
      var res_0 = this.evaluateFunction_0(funString, value);
      return res_0;
    }
    if (startsWith(expression, 40) && endsWith(expression, 41)) {
      var endIndex_1 = get_lastIndex(expression);
      return this.evaluate_0(expression.substring(1, endIndex_1));
    }
    if (this.isValue_0(expression))
      tmp$_3 = (tmp$_2 = this.extractNumber_0(expression)) != null ? tmp$_2 : -1.0;
    else if (equals(expression, 'PI'))
      tmp$_3 = math.PI;
    else if (equals(expression, 'E'))
      tmp$_3 = math.E;
    else
      throw NumberFormatException_init();
    return tmp$_3;
  };
  ExpressionParser.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'ExpressionParser',
    interfaces: []
  };
  var package$io = _.io || (_.io = {});
  var package$thelimitbreaker = package$io.thelimitbreaker || (package$io.thelimitbreaker = {});
  var package$kparser = package$thelimitbreaker.kparser || (package$thelimitbreaker.kparser = {});
  package$kparser.ExpressionParser = ExpressionParser;
  Kotlin.defineModule('KParser', _);
  return _;
}(typeof KParser === 'undefined' ? {} : KParser, kotlin);
